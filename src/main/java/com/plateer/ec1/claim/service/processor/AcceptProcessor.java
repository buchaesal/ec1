package com.plateer.ec1.claim.service.processor;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.service.helper.MonitoringLogHelper;
import com.plateer.ec1.claim.service.manipulator.ClaimDataManipulator;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import com.plateer.ec1.claim.service.validator.ClaimValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AcceptProcessor extends ClaimProcessor {

    private final ClaimDataManipulator manipulator;

    private AcceptProcessor(ClaimValidator claimValidator, MonitoringLogHelper monitoringLogHelper, ClaimDataManipulator manipulator) {
        super(claimValidator, monitoringLogHelper, manipulator);
        this.manipulator = manipulator;
    }

    @Override
    public void doProcess(ClaimDto claimDto) {

        log.info("클레임 Accept Processor start");
        Long logKey = null;

        try{

            // 클레임 번호 채번
            setClaimNo(claimDto);
            // 모니터링 로그 insert
            logKey = monitoringLogHelper.insertMonitoringLog("");
            // validation
            doValidationProcess(claimDto);
            // 데이터 insert/update
            doClaimDataProcess(claimDto);

        }catch (Exception e){
            log.error(e.getMessage());
        }finally {
            monitoringLogHelper.updateMonitortingLog(logKey, "");
        }

    }

    @Override
    public ProcessorType getType() {
        return ProcessorType.ACCEPT;
    }

    private void setClaimNo(ClaimDto claimDto){
        claimDto.setClaimNo("C1");
    }

}
