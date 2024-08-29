package com.absolutavelas.absolutabackend.services.products.homesprays.impl;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.database.repositories.products.HomesprayRepository;
import com.absolutavelas.absolutabackend.dtos.products.homesprays.HomesprayRequest;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.HomesprayFlavourSearchServiceImpl;
import com.absolutavelas.absolutabackend.services.products.homesprays.HomesprayRegisterService;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeSearchService;
import org.springframework.stereotype.Service;

@Service
public class HomesprayRegisterServiceImpl implements HomesprayRegisterService {
    private final HomesprayRepository homesprayRepository;
    private final HomesprayFlavourSearchServiceImpl homesprayFlavourSearchService;
    private final ProductSizeSearchService productSizeSearch;

    public HomesprayRegisterServiceImpl(HomesprayRepository homesprayRepository, HomesprayFlavourSearchServiceImpl homesprayFlavourSearchService,
                                        ProductSizeSearchService productSizeSearchService) {
        this.homesprayRepository = homesprayRepository;
        this.homesprayFlavourSearchService = homesprayFlavourSearchService;
        this.productSizeSearch = productSizeSearchService;
    }

    @Override
    public Homespray register(HomesprayRequest request) {
        homesprayFlavourSearchService.findByIdentifier(request.flavour());
        productSizeSearch.findByIdentifier(request.size());

        Homespray homespray = new Homespray.Builder()
                .name(request.name())
                .description(request.description())
                .stockAmount(request.stockAmount())
                .price(request.price())
                .isActive(request.isActive())
                .size(request.size())
                .build();

        return homesprayRepository.save(homespray);
    }
}