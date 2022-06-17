package com.plateer.ec1.order.strategy.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.AfterStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BoAfterStrategy implements AfterStrategy {
    @Override
    public void call(OrderRequest orderRequest, OrderDto orderDto) {
        log.info("BO 주문 후처리");
    }
}
