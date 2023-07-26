package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataInterface;

import java.math.BigDecimal;

/**
 * 合同基本信息；
 * 
 * @author huanghaiquan
 *
 */
@DataInterface(topic = "合同信息")
public interface ContractInfoVI {
	String getCode();

	void setCode(String code);

	String getTitle();

	void setTitle(String contract_name);

	String getCustomerName();

	void setCustomerName(String customer_name);

	BigDecimal getAmount();

	void setAmount(BigDecimal contract_amount);

	String getContact();

	void setContact(String contact);

	String getCustomerContactNumber();

	void setCustomerContactNumber(String contact_number);

	String getAddress();

	void setAddress(String address);

	Long getSignedDate();

	void setSignedDate(Long signed_date);

	ContractProcessStatus getContractProcessStatus();

	void setContractProcessStatus(ContractProcessStatus contractStatus);

	PaymentType getPaymentType();

	void setPaymentType(PaymentType checkedMethod);

	Long getProjectStartDate();

	void setProjectStartDate(Long contract_start_date);

	Long getProjectCompletionDate();

	void setProjectCompletionDate(Long contract_end_date);
}
