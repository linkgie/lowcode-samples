package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.metadata.DataInterface;

import java.math.BigDecimal;
@DataInterface(topic = "合同信息")
public interface ContractInfoVI {
    String getContract_number();

    void setContract_number(String contract_number);

    String getContract_name();

    void setContract_name(String contract_name);

    String getCustomer_name();

    void setCustomer_name(String customer_name);

    BigDecimal getContract_amount();

    void setContract_amount(BigDecimal contract_amount);

    String getContact();

    void setContact(String contact);

    String getContact_number();

    void setContact_number(String contact_number);

    String getAddress();

    void setAddress(String address);

    ContractStatus getContractStatus();

    void setContractStatus(ContractStatus contractStatus);

    PaymentType getCheckedMethod();

    void setCheckedMethod(PaymentType checkedMethod);

    long getContract_start_date();

    void setContract_start_date(long contract_start_date);

    long getContract_end_date();

    void setContract_end_date(long contract_end_date);
}
