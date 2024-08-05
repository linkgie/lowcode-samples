package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.*;

/**
 * 员工；
 */
@DataEntity
public class BusinessEmployeeVO implements BusinessEmployeeVI {
    @DataKey
    @DataField(name="Id",readonly = true,order = 0)
    private String id;

    @DataLabel
    @DataField(name="名称",order = 1)
    private String name;
    
    @DataField(name="级别",order = 2)
    private JobLevel level;
    
    @DataField(name="负责行业",order = 3)
    private String busness;

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

	@Override
	public JobLevel getLevel() {
		return level;
	}

	@Override
	public void setLevel(JobLevel level) {
		this.level = level;
	}

	@Override
	public String getBusness() {
		return busness;
	}

	@Override
	public void setBusness(String busness) {
		this.busness = busness;
	}
}
