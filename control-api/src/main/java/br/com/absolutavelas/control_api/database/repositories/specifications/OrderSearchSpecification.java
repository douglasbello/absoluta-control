package br.com.absolutavelas.control_api.database.repositories.specifications;

import br.com.absolutavelas.control_api.database.models.Order;
import org.springframework.data.jpa.domain.Specification;

public class OrderSearchSpecification {

    public static Specification<Order> hasMarketplace(Integer marketplaceId) {
        return (root, query, criteriaBuilder) ->
                marketplaceId == null ? criteriaBuilder.conjunction() : criteriaBuilder.equal(root.get("marketplace").get("id"), marketplaceId);
    }

    public static Specification<Order> hasPaymentType(Integer typeId) {
        return (root, query, criteriaBuilder) ->
                typeId == null ? criteriaBuilder.conjunction() : criteriaBuilder.equal(root.get("paymentType").get("id"), typeId);
    }
}