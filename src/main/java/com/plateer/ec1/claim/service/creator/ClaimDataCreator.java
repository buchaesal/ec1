package com.plateer.ec1.claim.service.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimModel;

public interface ClaimDataCreator {
     ClaimModel getInsertClaimData(ClaimDto claimDto);
     ClaimModel getUpdateClaimData(ClaimDto claimDto);
}
