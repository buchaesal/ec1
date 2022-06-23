package com.plateer.ec1.claim.service.processor.abstracts;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.service.creator.ClaimDataCreator;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.manipulator.ClaimDataManipulator;
import com.plateer.ec1.claim.service.validator.ClaimValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class ClaimProcessor {

    protected final ClaimValidator claimValidator;
    protected final MonitoringLogHelper monitoringLogHelper;
    protected final ClaimDataManipulator manipulator;

    protected void doValidationProcess(ClaimDto claimDto){
        claimValidator.validate(claimDto);
    }

    protected void doClaimDataProcess(ClaimDto claimDto){
//        ClaimDataCreator claimDataCreator = ClaimType.findCreator(claimDto.getClaimType());
//        manipulator.insertClaimData(claimDataCreator.getInsertClaimData(claimDto));
//        manipulator.updateClaimData(claimDataCreator.getUpdateClaimData(claimDto));
    }

    abstract public void doProcess(ClaimDto claimDto);

    abstract public ProcessorType getType();

}
