package com.linkgie.lowcode.dev.platform.demo.data;

import com.linkgie.galaxyframework.metadata.DataLabel;

public enum ContractStatus {
    DRAFT("草稿"),

    APPROVAL("审批中"),

    SIGNING("签署中"),

    SIGNED("已签署"),

    EXECUTING("执行中"),

    FINISH("完成"),

    DISCONTINUED("中止"),

    CANCEL("取消");

    @DataLabel
    public final String NAME;

    private ContractStatus(String name){
        this.NAME = name;
    }
}
