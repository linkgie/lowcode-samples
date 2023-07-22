package com.linkgie.lowcode.dev.platform.demo.data;

import com.linkgie.galaxyframework.metadata.DataInterface;

@DataInterface(topic = "部门信息")
public interface ContractDepartmentInfoVI {
    String getDepariment();

    void setDepariment(String depariment);

    String getSigned_date();

    void setSigned_date(String signed_date);

    String[] getPersons();

    void setPersons(String[] persons);

    String[] getHanding_department();

    void setHanding_department(String[] handing_department);
}
