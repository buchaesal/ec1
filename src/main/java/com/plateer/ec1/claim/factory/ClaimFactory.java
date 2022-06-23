package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.service.processor.abstracts.ClaimProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClaimFactory {

    private final Map<ProcessorType, ClaimProcessor> processorMap = new HashMap<>();

    public ClaimFactory(List<ClaimProcessor> processorList){
        processorList.forEach(e -> processorMap.put(e.getType(), e));
    }

    public ClaimProcessor getClaimProcessor(ProcessorType type){
        try {
            return processorMap.get(type);
        }catch (NullPointerException e){
            throw new IllegalArgumentException("해당하는 클레임 프로세서가 없습니다!");
        }
    }

}
