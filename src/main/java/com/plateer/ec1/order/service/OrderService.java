package com.plateer.ec1.order.service;

import com.plateer.ec1.order.context.OrderContext;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.order.strategy.impl.BoAfterStrategy;
import com.plateer.ec1.order.strategy.impl.EcouponDataStrategy;
import com.plateer.ec1.order.strategy.impl.FoAfterStrategy;
import com.plateer.ec1.order.strategy.impl.GeneralDataStrategy;
import com.plateer.ec1.payment.service.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
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

        DataStrategy dataStrategy = null;

        if ("general".equals(orderRequest.getOrderType())){
            dataStrategy = new GeneralDataStrategy();
        }else if ("ecoupon".equals(orderRequest.getOrderType())){
            dataStrategy = new EcouponDataStrategy();
        }

        return dataStrategy;
    }

    private AfterStrategy getAfterStrategy(OrderRequest orderRequest){

        AfterStrategy strategy = null;

        if("FO".equals(orderRequest.getSystemType())) {
            strategy = new FoAfterStrategy();
        } else if ("BO".equals(orderRequest.getSystemType())) {
            strategy = new BoAfterStrategy();
        }

        return strategy;
    }

}
