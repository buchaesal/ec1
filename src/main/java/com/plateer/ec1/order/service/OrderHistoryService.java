package com.plateer.ec1.order.service;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderHistoryService {

    public Long insertOrderHistory(OrderRequest orderRequest){
        log.info("주문 이력 insert");
        return null;
    }

    public void updateOrderHistory(Long historyNo, OrderDto orderDto){

    }

}
