package com.absolutavelas.absolutabackend.dtos.marketplaces;

import java.util.UUID;

public record MarketplaceRequest(String name,
                                 String location,
                                 UUID typeIdentifier) {
}