package com.plateer.ec1.claim.service.processor;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.service.helper.IFCallHelper;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import com.plateer.ec1.claim.service.validator.ClaimValidator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CompleteProcessor extends ClaimProcessor {

    private static CompleteProcessor completeProcessor;
    private final IFCallHelper ifCallHelper;

    public CompleteProcessor(ClaimValidator claimValidator, MonitoringLogHelper monitoringLogHelper, IFCallHelper ifCallHelper) {
        super(claimValidator, monitoringLogHelper);
        this.ifCallHelper = ifCallHelper;
    }

    @PostConstruct
    private void initialize() {
        completeProcessor = this;
    }

    public static CompleteProcessor getInstance() {
        return completeProcessor;
    }

    @Override
    public void doProcess(ClaimDto claimDto) {

        try{

            doValidationProcess(claimDto);
            ifCallHelper.callPaymentIF();
        }catch (Exception e){

        }finally {
            // 로그
        }

    }

}
