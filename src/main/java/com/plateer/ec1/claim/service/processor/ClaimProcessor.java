package com.plateer.ec1.claim.service.processor;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.service.creator.ClaimDataCreator;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.manipulator.ClaimDataManipulator;
import com.plateer.ec1.claim.service.validator.ClaimValidator;

public abstract class ClaimProcessor {

    protected ClaimValidator claimValidator;
    protected ClaimDataCreator claimDataCreator;
    protected ClaimDataManipulator claimDataManipulator;
    protected MonitoringLogHelper monitoringLogHelper;

    protected void doValidationProcess(ClaimDto claimDto){

    }

    abstract protected void doClaimDataManipulateProcess(ClaimDto claimDto);

    protected void verifyAmount(ClaimDto claimDto) {

    }

    abstract public void doProcess(ClaimDto claimDto);

}
