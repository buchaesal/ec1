package com.plateer.ec1.order.service;

import com.plateer.ec1.order.context.OrderContext;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.payment.service.PayService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService {

    private final OrderHistoryService orderHistoryService;
    private final OrderRepository orderRepository;
    private final PayService payService;

    public void order(OrderRequest orderRequest){
        OrderContext orderContext = new OrderContext(orderHistoryService, payService, orderRepository);
        orderContext.execute(getDataStrategy(orderRequest), getAfterStrategy(orderRequest), orderRequest);
    }

    private DataStrategy getDataStrategy(OrderRequest orderRequest){
        return null;
    }

    private AfterStrategy getAfterStrategy(OrderRequest orderRequest){
        return null;
    }


}
