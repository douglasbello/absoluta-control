package com.absolutavelas.absolutabackend.services.products.candles.impl;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleRepository;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;
import com.absolutavelas.absolutabackend.services.products.candles.CandleRegisterService;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.CandleFlavourSearchServiceImpl;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeSearchService;
import org.springframework.stereotype.Service;

@Service
public class CandleRegisterServiceImpl implements CandleRegisterService {
    private final CandleRepository candleRepository;
    private final CandleFlavourSearchServiceImpl candleFlavourSearchService;
    private final ProductSizeSearchService productSizeSearchService;

    public CandleRegisterServiceImpl(CandleRepository candleRepository, CandleFlavourSearchServiceImpl candleFlavourSearchService,
                                     ProductSizeSearchService productSizeSearchService) {
        this.candleRepository = candleRepository;
        this.candleFlavourSearchService = candleFlavourSearchService;
        this.productSizeSearchService = productSizeSearchService;
    }

    @Override
    public Candle register(CandleRequest request) {
        if (request.flavour() != null)
            candleFlavourSearchService.findByIdentifier(request.flavour());
        if (request.size() != null)
            productSizeSearchService.findByIdentifier(request.size());

        Candle candle = new Candle.Builder()
                .name(request.name())
                .description(request.description())
                .stockAmount(request.stockAmount())
                .price(request.price())
                .isActive(request.isActive())
                .size(request.size())
                .build();

        candle.setFlavourIdentifier(request.flavour());

        return candleRepository.save(candle);
    }
}