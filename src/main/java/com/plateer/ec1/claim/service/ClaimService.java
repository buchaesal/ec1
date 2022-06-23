package com.plateer.ec1.claim.service;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.factory.ClaimFactory;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClaimService {

    private final ClaimFactory claimFactory;

    public void claim(ClaimDto claimDto){
        ClaimProcessor claimProcessor = claimFactory.getClaimProcessor(ClaimType.getProcessorType(claimDto.getClaimType()));
        claimProcessor.doProcess(claimDto);
    }

}
