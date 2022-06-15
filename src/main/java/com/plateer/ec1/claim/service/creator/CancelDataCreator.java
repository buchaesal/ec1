package com.plateer.ec1.claim.service.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;

public class CancelDataCreator extends ClaimDataCreator {

    @Override
    ClaimModel getInsertClaimData(ClaimDto claimDto) {
        return null;
    }

    @Override
    ClaimModel getUpdateClaimData(ClaimDto claimDto) {
        return null;
    }
}
