package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataInterface;

@DataInterface
public interface BusinessEmployeeVI {
	
    String getName();

    void setName(String name);

	void setBusness(String busness);

	String getBusness();

	void setLevel(JobLevel level);

	JobLevel getLevel();

}
