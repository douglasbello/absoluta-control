package br.com.absolutavelas.control_api.services.orders.register.impl;

import br.com.absolutavelas.control_api.database.models.*;
import br.com.absolutavelas.control_api.database.repositories.OrderRepository;
import br.com.absolutavelas.control_api.dtos.orders.OrderRequest;
import br.com.absolutavelas.control_api.services.orders.register.OrderProductRegisterService;
import br.com.absolutavelas.control_api.services.orders.register.OrderRegisterService;
import br.com.absolutavelas.control_api.services.products.search.marketplaces.MarketplaceSearchService;
import br.com.absolutavelas.control_api.services.products.search.marketplaces.PaymentTypeSearchService;
import br.com.absolutavelas.control_api.services.products.search.products.ProductSearchService;
import br.com.absolutavelas.control_api.services.products.update.ProductUpdateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrderRegisterServiceImpl implements OrderRegisterService {
    private final OrderRepository orderRepository;
    private final PaymentTypeSearchService paymentTypeSearchService;
    private final OrderProductRegisterService orderProductRegisterService;
    private final MarketplaceSearchService marketplaceSearchService;
    private final ProductSearchService productSearchService;
    private final ProductUpdateService productUpdateService;

    public OrderRegisterServiceImpl(OrderRepository orderRepository,
                                    PaymentTypeSearchService paymentTypeSearchService,
                                    OrderProductRegisterService orderProductRegisterService,
                                    MarketplaceSearchService marketplaceSearchService,
                                    ProductSearchService productSearchService,
                                    ProductUpdateService productUpdateService) {
        this.orderRepository = orderRepository;
        this.paymentTypeSearchService = paymentTypeSearchService;
        this.orderProductRegisterService = orderProductRegisterService;
        this.marketplaceSearchService = marketplaceSearchService;
        this.productSearchService = productSearchService;
        this.productUpdateService = productUpdateService;
    }

    @Transactional
    @Override
    public Order register(OrderRequest request) {
        PaymentType type = paymentTypeSearchService.findById(request.paymentTypeId());
        Marketplace marketplace = marketplaceSearchService.findById(request.marketplaceId());

        Order order = new Order(request.discount(), marketplace, type);
        order = orderRepository.save(order);

        AtomicLong amount = new AtomicLong();
        Order finalOrder = order;
        request.productAmounts().forEach(p -> {
            Product product = productSearchService.findById(p.productId());
            product.setStockAmount(product.getStockAmount() - p.amount());
            productUpdateService.update(product);
            OrderProduct op = new OrderProduct(finalOrder.getId(), p.productId(), p.amount());
            orderProductRegisterService.register(op);
            amount.addAndGet(p.amount());
            finalOrder.setSubTotal(finalOrder.getSubTotal().add(product.getPrice().multiply(BigDecimal.valueOf(p.amount()))));
        });

        finalOrder.setTotal(finalOrder.getSubTotal().subtract(finalOrder.getDiscount()));

        finalOrder.setAmount(amount.get());
        return orderRepository.save(finalOrder);
    }
}