package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataInterface;

/**
 * 项目合同的部门相关信息；
 * 
 * @author huanghaiquan
 *
 */
@DataInterface(topic = "部门信息")
public interface ContractDepartmentInfoVI {
	String getSalesDepartment();

	void setSalesDepartment(String depariment);

	String[] getSalesEmployees();

	void setSalesEmployees(String[] persons);

	String[] getSupportsDepartments();

	void setSupportsDepartments(String[] handing_department);
}
