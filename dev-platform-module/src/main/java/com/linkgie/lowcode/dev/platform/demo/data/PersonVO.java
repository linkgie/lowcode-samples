package com.linkgie.lowcode.dev.platform.demo.data;

import com.linkgie.galaxyframework.metadata.*;

@DataEntity
@DataInterface
public class PersonVO implements PersonVI {
    @DataKey
    @DataField(name="ID",readonly = true,order = 0)
    private String id;

    @DataLabel
    @DataField(name="名字",order = 1)
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
