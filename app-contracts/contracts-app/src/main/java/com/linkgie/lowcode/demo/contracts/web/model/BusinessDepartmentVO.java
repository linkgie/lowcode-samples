package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.*;

/**
 * 部门；
 * 
 * @author huanghaiquan
 *
 */
@DataEntity
public class BusinessDepartmentVO implements BusinessDepartmentVI {

	@DataKey
	@DataField(name = "ID", readonly = true, order = 0)
	private String id;

	@DataLabel
	@DataField(name = "部门名称", order = 1)
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
