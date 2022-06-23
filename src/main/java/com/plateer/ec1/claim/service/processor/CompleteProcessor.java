package com.plateer.ec1.claim.service.processor;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.service.helper.IFCallHelper;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.manipulator.ClaimDataManipulator;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import com.plateer.ec1.claim.service.validator.ClaimValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class CompleteProcessor extends ClaimProcessor {

    private final IFCallHelper ifCallHelper;

    public CompleteProcessor(ClaimValidator claimValidator, MonitoringLogHelper monitoringLogHelper, ClaimDataManipulator manipulator, IFCallHelper ifCallHelper) {
        super(claimValidator, monitoringLogHelper, manipulator);
        this.ifCallHelper = ifCallHelper;
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        log.info("클레임 Complete Processor start");
        Long logKey = null;

        try{
            // 모니터링 로그 insert
            logKey = monitoringLogHelper.insertMonitoringLog("log");
            // validation
            doValidationProcess(claimDto);
            // 데이터 insert/update
            doClaimDataProcess(claimDto);
            // 결제 if
            ifCallHelper.callPaymentIF();
            // 쿠폰 복원 if
            ifCallHelper.callRestoreCouponIF();
        }catch (Exception e){
            log.error(e.getMessage());
        }finally {
            monitoringLogHelper.updateMonitortingLog(logKey, "");
        }

    }

    @Override
    public ProcessorType getType() {
        return ProcessorType.COMPLETE;
    }

}
