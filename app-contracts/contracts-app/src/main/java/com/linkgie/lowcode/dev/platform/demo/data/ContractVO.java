package com.linkgie.lowcode.dev.platform.demo.data;

import com.linkgie.galaxyframework.fileservice.FileEntry;
import com.linkgie.galaxyframework.metadata.*;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@DataEntity
@DataInterface
public class ContractVO implements ContractInfoVI, ContractDepartmentInfoVI, ContractOtherInfo {
    @DataKey
    @DataField(name="ID",readonly = true,order = 0)
    private String id;

    @NotBlank
    @DataField(name = "合同号",modifiable = false,order = 1)
    private  String contract_number;

    @NotBlank
    @DataField(name = "合同名称",order = 2)
    private String contract_name;

    @NotBlank
    @DataField(name = "客户名称",order = 3)
    private String customer_name;

    @NotBlank
    @DataField(name = "合同金额",order = 4)
    private BigDecimal contract_amount;

    @NotBlank
    @DataField(name = "联系人",order = 5)
    private String contact;

    @NotBlank
    @DataField(name = "联系电话",order = 6)
    private String contact_number;

    @DataType(contentType = "plain;multiline=true")
    @DataField(name = "地址",order = 7)
    private String address;

    @NotBlank
    @DataField(name = "合同状态",order = 8)
    private ContractStatus contractStatus;

    @NotBlank
    @DataField(name = "结账方式",order = 9)
    private CheckedMethod checkedMethod;

    @NotBlank
    @DataType(dataType = StandardType.TIMESTAMP, contentType = "datetime;format='YYYY-MM-DD HH:mm:ss'")
    @DataField(name = "合同开始日期",order = 10)
    private long contract_start_date;

    @NotBlank
    @DataType(dataType = StandardType.TIMESTAMP, contentType = "datetime;format='YYYY-MM-DD HH:mm:ss'")
    @DataField(name = "合同结束日期",order = 11)
    private long contract_end_date;

    @NotBlank
    @DataReference(model = DepartmentVO.class,interfase = DepartmentVI.class)
    @DataField(name="部门信息",order = 12)
    private String depariment;

    @NotBlank
    @DataType(dataType = StandardType.TIMESTAMP, contentType = "datetime;format='YYYY-MM-DD HH:mm:ss'")
    @DataField(name="签订日期",order = 13)
    private String signed_date;

    @DataReference(model = PersonVO.class,interfase = PersonVI.class)
    @DataField(name = "招商人员",order = 14)
    private String[] persons;

    @DataReference(model = DepartmentVO.class,interfase = DepartmentVI.class)
    @DataField(name = "经办部门",order = 15)
    private String[] handing_department;


    @DataType(dataType = StandardType.TEXT,contentType = "plain;multiline=true")
    @DataField(name = "备注",order = 13)
    private String remark;

    @NotBlank
    @DataType(dataType = StandardType.OBJECT,contentType = "file;limits=6")
    @DataField(name = "合同附件",order = 14)
    private FileEntry[] annex;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getContract_number() {
        return contract_number;
    }

    @Override
    public void setContract_number(String contract_number) {
        this.contract_number = contract_number;
    }

    @Override
    public String getContract_name() {
        return contract_name;
    }

    @Override
    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    @Override
    public String getCustomer_name() {
        return customer_name;
    }

    @Override
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    @Override
    public BigDecimal getContract_amount() {
        return contract_amount;
    }

    @Override
    public void setContract_amount(BigDecimal contract_amount) {
        this.contract_amount = contract_amount;
    }

    @Override
    public String getContact() {
        return contact;
    }

    @Override
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String getContact_number() {
        return contact_number;
    }

    @Override
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public ContractStatus getContractStatus() {
        return contractStatus;
    }

    @Override
    public void setContractStatus(ContractStatus contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Override
    public CheckedMethod getCheckedMethod() {
        return checkedMethod;
    }

    @Override
    public void setCheckedMethod(CheckedMethod checkedMethod) {
        this.checkedMethod = checkedMethod;
    }

    @Override
    public long getContract_start_date() {
        return contract_start_date;
    }

    @Override
    public void setContract_start_date(long contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    @Override
    public long getContract_end_date() {
        return contract_end_date;
    }

    @Override
    public void setContract_end_date(long contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    @Override
    public String getDepariment() {
        return depariment;
    }

    @Override
    public void setDepariment(String depariment) {
        this.depariment = depariment;
    }

    @Override
    public String getSigned_date() {
        return signed_date;
    }

    @Override
    public void setSigned_date(String signed_date) {
        this.signed_date = signed_date;
    }

    @Override
    public String[] getPersons() {
        return persons;
    }

    @Override
    public void setPersons(String[] persons) {
        this.persons = persons;
    }

    @Override
    public String[] getHanding_department() {
        return handing_department;
    }

    @Override
    public void setHanding_department(String[] handing_department) {
        this.handing_department = handing_department;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public FileEntry[] getAnnex() {
        return annex;
    }

    @Override
    public void setAnnex(FileEntry[] annex) {
        this.annex = annex;
    }
}
