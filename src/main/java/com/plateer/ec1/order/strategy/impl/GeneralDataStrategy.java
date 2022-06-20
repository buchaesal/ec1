package com.plateer.ec1.order.strategy.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.DataStrategy;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class GeneralDataStrategy implements DataStrategy {

    @Override
    public OrderDto create(OrderRequest orderRequest, List<OrderProductView> viewList) {
        log.info("일반 주문 데이터 create - orderRequest : {}, viewList : {}", orderRequest, viewList);
        return null;
    }

}
