package com.plateer.ec1.order.enums;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.validator.OrderCommonValidator;

import java.util.Arrays;
import java.util.function.Predicate;

public enum OrderValidator implements Predicate<OrderValidationDto> {

    FO_GENERAL("FO", "general", OrderCommonValidator.commonValidator),
    BO_GENERAL("BO", "general", OrderCommonValidator.commonValidator),
    FO_ECOUPON("FO", "ecoupon", OrderCommonValidator.commonValidator),
    BO_ECOUPON("BO", "ecoupon", OrderCommonValidator.commonValidator);

    private String systemCode;
    private String orderType;
    private Predicate predicate;

    OrderValidator(String systemCode, String orderType, Predicate predicate) {
        this.systemCode = systemCode;
        this.orderType = orderType;
        this.predicate = predicate;
    }

    @Override
    public boolean test(OrderValidationDto orderValidationDto){
        return predicate.test(orderValidationDto);
    }

    public static OrderValidator get(OrderRequest orderRequest){
        return Arrays.stream(OrderValidator.values())
                .filter(ele -> ele.orderType.equals(orderRequest.getOrderType()) && ele.systemCode.equals(orderRequest.getSystemType()))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("해당하는 주문유형이 없습니다!"));
    }

}
