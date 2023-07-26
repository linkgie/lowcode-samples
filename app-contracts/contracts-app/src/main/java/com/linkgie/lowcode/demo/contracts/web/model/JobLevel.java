package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataLabel;

public enum JobLevel {
	
	JUNIOR("初级"),
	
	INTERMEDIATE("中级"),
	
	ADVANCED("高级"),
	
	MANAGER("经理"),
	
	DIRECTOR("总监"),
	
	PRESIDENT("总裁");
	

	@DataLabel
	public final String NAME;

	private JobLevel(String name) {
		this.NAME = name;
	}
}
