package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataLabel;

/**
 * 支付方式；
 * 
 * @author huanghaiquan
 *
 */
public enum PaymentType {

    CASH("现金"),

    CHEQUE("支票"),

    CABLE_TRANSFER("电汇");

    @DataLabel
    public final String NAME;

    private PaymentType(String name){
        this.NAME = name;
    }
}
