package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataInterface;

import java.math.BigDecimal;
@DataInterface(topic = "合同信息")
public interface ContractInfoVI {
    String getCode();

    void setCode(String contract_number);

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

    long getSignedDate();

    void setSignedDate(long signed_date);

    ContractProcessStatus getContractProcessStatus();

    void setContractProcessStatus(ContractProcessStatus contractStatus);

    PaymentType getPaymentType();

    void setPaymentType(PaymentType checkedMethod);

    long getProjectStartDate();

    void setProjectStartDate(long contract_start_date);

    long getProjectCompletionDate();

    void setProjectCompletionDate(long contract_end_date);
}
