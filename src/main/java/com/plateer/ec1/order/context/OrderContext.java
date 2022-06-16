package com.plateer.ec1.order.context;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.service.OrderHistoryService;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.payment.service.PayService;

public class OrderContext {

    private OrderHistoryService orderHistoryService;
    private PayService payService;
    private OrderRepository orderRepository;

    public OrderContext(OrderHistoryService orderHistoryService, PayService payService, OrderRepository orderRepository) {
        this.orderHistoryService = orderHistoryService;
        this.payService = payService;
        this.orderRepository = orderRepository;
    }

    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest){

    }

    private void amountValidation(String orderNo){

    }

    private void insertOrderData(OrderDto orderDto){

    }

}
