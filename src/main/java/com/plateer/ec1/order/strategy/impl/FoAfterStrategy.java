package com.plateer.ec1.order.strategy.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.AfterStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FoAfterStrategy implements AfterStrategy {

    @Override
    public void call(OrderRequest orderRequest, OrderDto orderDto) {
        log.info("FO 주문 후처리");
    }

}
