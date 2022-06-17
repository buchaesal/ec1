package com.plateer.ec1.claim.service.processor.abstracts;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.validator.ClaimValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class ClaimProcessor {

    protected final ClaimValidator claimValidator;
    protected final MonitoringLogHelper monitoringLogHelper;

    protected void doValidationProcess(ClaimDto claimDto){

    }

    abstract public void doProcess(ClaimDto claimDto);

}
