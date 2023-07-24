package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataLabel;

/**
 * 合同进展状态；
 * 
 * @author huanghaiquan
 *
 */
public enum ContractProcessStatus {
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

	private ContractProcessStatus(String name) {
		this.NAME = name;
	}
}
