package br.com.absolutavelas.control_api.dtos.marketplaces;

public record MarketplaceRequest(
        String name,
        String location,
        Integer typeId
) {
}