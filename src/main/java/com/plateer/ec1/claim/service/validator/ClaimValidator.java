package com.plateer.ec1.claim.service.validator;

import com.plateer.ec1.claim.dto.ClaimDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClaimValidator {

    public void validate(ClaimDto claimDto){
        log.info("클레임 validation");
    }

    private void isValidStatus(ClaimDto claimDto){

    }

    private void isValidAmount(ClaimDto claimDto){

    }

    private void verifyAmount(ClaimDto claimDto){

    }

}
