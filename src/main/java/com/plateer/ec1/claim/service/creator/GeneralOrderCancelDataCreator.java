package com.plateer.ec1.claim.service.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;
import lombok.RequiredArgsConstructor;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
public class GeneralOrderCancelDataCreator extends ClaimDataCreator{

    private static ClaimDataCreator claimDataCreator;

    @PostConstruct
    void init(){
        claimDataCreator = this;
    }

    public static ClaimDataCreator getInstance(){
        return claimDataCreator;
    }

    @Override
    ClaimModel getInsertClaimData(ClaimDto claimDto) {
        return null;
    }

    @Override
    ClaimModel getUpdateClaimData(ClaimDto claimDto) {
        return null;
    }
}
