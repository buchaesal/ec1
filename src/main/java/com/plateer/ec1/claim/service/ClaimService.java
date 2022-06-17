package com.plateer.ec1.claim.service;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {
    public void claim(ClaimDto claimDto){
        ClaimProcessor claimProcessor = ClaimType.findProcessor(claimDto.getClaimType());
        claimProcessor.doProcess(claimDto);
    }
}
