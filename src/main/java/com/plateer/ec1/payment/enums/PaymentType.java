package com.plateer.ec1.payment.enums;

public enum PaymentType {

    INICIS("inicis"),
    POINT("point");

    private String type;

    PaymentType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
