package com.plateer.ec1.claim.service.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;

public abstract class ClaimDataCreator {
    abstract ClaimModel getInsertClaimData(ClaimDto claimDto);
    abstract ClaimModel getUpdateClaimData(ClaimDto claimDto);
}
