package com.jvcompany.services.entities.enums;

public enum OrderStatus {

    PAID(1),

    SHIPPED(2),

    CANCELED(3);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Code");
    }
}
