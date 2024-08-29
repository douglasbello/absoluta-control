package com.absolutavelas.absolutabackend.services.products.candles.impl;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleRepository;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;
import com.absolutavelas.absolutabackend.services.products.candles.CandleRegisterService;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.CandleFlavourSearchServiceImpl;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeSearch;
import org.springframework.stereotype.Service;

@Service
public class CandleRegisterServiceImpl implements CandleRegisterService {
    private final CandleRepository candleRepository;
    private final CandleFlavourSearchServiceImpl candleFlavourSearchService;
    private final ProductSizeSearch productSizeSearch;

    public CandleRegisterServiceImpl(CandleRepository candleRepository, CandleFlavourSearchServiceImpl candleFlavourSearchService,
                                     ProductSizeSearch productSizeSearch) {
        this.candleRepository = candleRepository;
        this.candleFlavourSearchService = candleFlavourSearchService;
        this.productSizeSearch = productSizeSearch;
    }

    @Override
    public Candle register(CandleRequest request) {
        candleFlavourSearchService.findByIdentifier(request.flavour());
        productSizeSearch.findByIdentifier(request.size());

        Candle candle = new Candle.Builder()
                .name(request.name())
                .description(request.description())
                .stockAmount(request.stockAmount())
                .price(request.price())
                .isActive(request.isActive())
                .size(request.size())
                .build();

        return candleRepository.save(candle);
    }
}