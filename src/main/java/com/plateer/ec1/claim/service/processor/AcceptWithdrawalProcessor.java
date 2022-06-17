package com.plateer.ec1.claim.service.processor;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import com.plateer.ec1.claim.service.validator.ClaimValidator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AcceptWithdrawalProcessor extends ClaimProcessor {

    private static AcceptWithdrawalProcessor acceptWithdrawalProcessor;

    public AcceptWithdrawalProcessor(ClaimValidator claimValidator, MonitoringLogHelper monitoringLogHelper) {
        super(claimValidator, monitoringLogHelper);
    }

    @PostConstruct
    private void initialize() {
        acceptWithdrawalProcessor = this;
    }

    public static AcceptWithdrawalProcessor getInstance() {

        return acceptWithdrawalProcessor;
    }

    @Override
    protected void doClaimDataManipulateProcess(ClaimDto claimDto) {

    }

    @Override
    public void doProcess(ClaimDto claimDto) {

    }
}
