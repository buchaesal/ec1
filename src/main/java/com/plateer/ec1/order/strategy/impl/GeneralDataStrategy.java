package com.plateer.ec1.order.strategy.impl;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.strategy.DataStrategy;

import java.util.List;

public class GeneralDataStrategy implements DataStrategy {
    @Override
    public OrderDto create(OrderRequest orderRequest, List<OrderProductView> viewList) {
        return null;
    }
}
