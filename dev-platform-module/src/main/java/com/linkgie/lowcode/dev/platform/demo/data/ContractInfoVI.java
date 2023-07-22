package com.linkgie.lowcode.dev.platform.demo.data;

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

    CheckedMethod getCheckedMethod();

    void setCheckedMethod(CheckedMethod checkedMethod);

    String getContract_start_date();

    void setContract_start_date(String contract_start_date);

    String getContract_end_date();

    void setContract_end_date(String contract_end_date);
}
