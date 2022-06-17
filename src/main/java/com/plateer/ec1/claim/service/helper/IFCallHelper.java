package com.plateer.ec1.claim.service.helper;

import com.plateer.ec1.claim.dto.ClaimModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IFCallHelper {

    public void callRestoreCouponIF(ClaimModel claimModel){

    }

    public void callPaymentIF(){
        log.info("클레임 :: 결제 if 호출");
    }

}
