package com.plateer.ec1.order.context;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderProductView;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.enums.OrderValidator;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.service.OrderHistoryService;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.payment.service.PayService;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
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
        Long historyNo = orderHistoryService.insertOrderHistory(orderRequest);
        OrderDto dto = null;
        try {
            // validation
            OrderValidator.get(orderRequest).test(new OrderValidationDto(orderRequest, Arrays.asList(new OrderProductView())));

            // 데이터 생성
            dto = dataStrategy.create(orderRequest, Arrays.asList(new OrderProductView()));

            // 주문 데이터 입력
            insertOrderData(dto);

            // 금액검증
            amountValidation(orderRequest.getOrderNo());

            // 후처리
            afterStrategy.call(orderRequest, dto);
        } catch (Exception ex) {
            log.info("error: {}", ex);
        } finally {
            orderHistoryService.updateOrderHistory(historyNo, dto);
        }
    }

    private void amountValidation(String orderNo){
        log.info("주문 금액검증");
    }

    private void insertOrderData(OrderDto orderDto){
        log.info("주문 데이터 insert - OrderDto : {}", orderDto);
    }

}
