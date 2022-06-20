package com.plateer.ec1.claim.service.helper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IFCallHelper {

    public void callRestoreCouponIF(){
        log.info("클레임 쿠폰 복원 if");
    }

    public void callPaymentIF(){
        log.info("클레임 결제 if");
    }

}
