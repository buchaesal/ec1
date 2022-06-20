package com.plateer.ec1.claim.service.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class ExchangeWithdrawalDataCreator implements ClaimDataCreator{

    private static ClaimDataCreator claimDataCreator;

    @PostConstruct
    void init(){
        claimDataCreator = this;
    }

    public static ClaimDataCreator getInstance(){
        return claimDataCreator;
    }

    @Override
    public ClaimModel getInsertClaimData(ClaimDto claimDto) {
        log.info("getInsertClaimData");
        return null;
    }

    @Override
    public ClaimModel getUpdateClaimData(ClaimDto claimDto) {
        log.info("getUpdateClaimData");
        return null;
    }
}
