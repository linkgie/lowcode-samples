package com.linkgie.lowcode.dev.platform.demo.data;

import com.linkgie.galaxyframework.metadata.DataLabel;

public enum CheckedMethod {

    CASH("现金"),

    CHEQUE("支票"),

    TRANSFER("转账");

    @DataLabel
    public final String NAME;

    private CheckedMethod(String name){
        this.NAME = name;
    }
}
