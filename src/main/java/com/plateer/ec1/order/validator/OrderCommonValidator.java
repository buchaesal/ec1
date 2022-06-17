package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.dto.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class OrderCommonValidator {
    public static Predicate<OrderValidationDto> commonValidator = (dto) -> {
        log.info("주문 공통 유효성검사 : {}", dto);
        return dto != null;
    };
}
