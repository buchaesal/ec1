package com.plateer.ec1.claim.enums;

import java.util.Arrays;
import java.util.List;

public enum ClaimType {

    //일반상품주문취소완료
    GCC(ProcessorType.COMPLETE, Arrays.asList()),
    //모바일쿠폰주문취소접수
    MCA(ProcessorType.ACCEPT, Arrays.asList()),
    //모바일쿠폰주문취소완료
    MCC(ProcessorType.COMPLETE, Arrays.asList()),
    //반품접수
    RA(ProcessorType.ACCEPT, Arrays.asList()),
    //반품완료
    RC(ProcessorType.COMPLETE, Arrays.asList()),
    //반품철회
    RW(ProcessorType.ACCEPT, Arrays.asList()),
    //교환접수
    XA(ProcessorType.ACCEPT, Arrays.asList()),
    //교환철회
    XW(ProcessorType.ACCEPT, Arrays.asList());

    ProcessorType processorType;
    List<String> validStatuses;

    ClaimType(ProcessorType processorType, List<String> validStatuses){
        this.processorType = processorType;
        this.validStatuses = validStatuses;
    }

    public static ProcessorType getProcessorType(String name) {
        return Arrays.stream(ClaimType.values())
                .filter(type -> type.name().equals(name))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("클레임유형 요청이 잘못되었습니다."))
                .processorType;
    }

}
