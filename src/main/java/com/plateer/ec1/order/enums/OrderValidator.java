package com.plateer.ec1.order.enums;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;

public enum OrderValidator implements Predicate {
    FO_GENERAL("", "", null),
    BO_GENERAL("", "", null),
    FO_ECOUPON("", "", null),
    BO_ECOUPON("", "", null);

    private String systemCode;
    private String orderType;
    private Predicate predicate;

    OrderValidator(String systemCode, String orderType, Predicate predicate) {
        this.systemCode = systemCode;
        this.orderType = orderType;
        this.predicate = predicate;
    }

    public boolean test(OrderValidationDto orderValidationDto){
        return true;
    }

    public static OrderValidator get(OrderRequest orderRequest){
        return null;
    }

}
