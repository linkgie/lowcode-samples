package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.*;

@DataEntity
public class BusinessEmployeeVO implements BusinessEmployeeVI {
    @DataKey
    @DataField(name="Id",readonly = true,order = 0)
    private String id;

    @DataLabel
    @DataField(name="名称",order = 1)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
