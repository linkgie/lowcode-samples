package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.fileservice.FileEntry;
import com.linkgie.galaxyframework.metadata.*;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@DataEntity
@DataInterface
public class ContractVO implements ContractInfoVI, ContractDepartmentInfoVI, ContractExtInfoVI {
	@DataKey
	@DataField(name = "ID", readonly = true, order = 0)
	private String id;

	@NotBlank
	@DataField(name = "合同号", modifiable = false, order = 1)
	private String code;

	@NotBlank
	@DataField(name = "合同名称", order = 2)
	private String title;

	@NotBlank
	@DecimalType(precision = 2, min="0.00", max="100000000")
	@DataField(name = "合同金额", order = 3)
	private BigDecimal amount = new BigDecimal("0");

	@NotBlank
	@DataField(name = "支付方式", order = 4)
	private PaymentType paymentType;

	@NotBlank
	@DataField(name = "客户名称", order = 10)
	private String customerName;

	@NotBlank
	@DataField(name = "客户联系人", order = 11)
	private String customerContact;

	@NotBlank
	@DataField(name = "客户联系电话", order = 12)
	private String customerContactNumber;

	@DataType(contentType = "plain;multiline=true")
	@DataField(name = "客户公司地址", order = 13)
	private String customerCompanyAddress;

	
	@NotBlank
	@DataField(name = "合同进展状态", order = 20)
	private ContractProcessStatus contractProcessStatus;

	
	@NotBlank
	@DataType(dataType = StandardType.TIMESTAMP, contentType = "datetime;format='YYYY-MM-DD HH:mm:ss'")
	@DataField(name = "签订日期", order = 21)
	private long signedDate;
	

	@NotBlank
	@DataReference(model = BusinessDepartmentVO.class, interfase = BusinessDepartmentVI.class)
	@DataField(name = "销售部门", order = 22)
	private String salesDepartment;
	
	@DataReference(model = BusinessEmployeeVO.class, interfase = BusinessEmployeeVI.class)
	@DataField(name = "销售人员", order = 23)
	private String[] salesEmployees;

	@DataReference(model = BusinessDepartmentVO.class, interfase = BusinessDepartmentVI.class)
	@DataField(name = "支持部门", order = 24)
	private String[] supportsDepartments;

	@NotBlank
	@DataType(dataType = StandardType.TIMESTAMP, contentType = "datetime;format='YYYY-MM-DD HH:mm:ss'")
	@DataField(name = "项目开始日期", order = 25)
	private long projectStartDate;

	@NotBlank
	@DataType(dataType = StandardType.TIMESTAMP, contentType = "datetime;format='YYYY-MM-DD HH:mm:ss'")
	@DataField(name = "项目完成日期", order = 26)
	private long projectCompletionDate;


	@DataType(contentType = "plain;multiline=true")
	@DataField(name = "备注", order = 30)
	private String remark;

	@NotBlank
	@DataType(contentType = "file;limits=6")
	@DataField(name = "合同附件", order = 31)
	private FileEntry[] attachments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String getContact() {
		return customerContact;
	}

	@Override
	public void setContact(String contact) {
		this.customerContact = contact;
	}

	@Override
	public String getCustomerContactNumber() {
		return customerContactNumber;
	}

	@Override
	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}

	@Override
	public String getAddress() {
		return customerCompanyAddress;
	}

	@Override
	public void setAddress(String address) {
		this.customerCompanyAddress = address;
	}

	@Override
	public ContractProcessStatus getContractProcessStatus() {
		return contractProcessStatus;
	}

	@Override
	public void setContractProcessStatus(ContractProcessStatus contractProcessStatus) {
		this.contractProcessStatus = contractProcessStatus;
	}

	@Override
	public PaymentType getPaymentType() {
		return paymentType;
	}

	@Override
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public long getProjectStartDate() {
		return projectStartDate;
	}

	@Override
	public void setProjectStartDate(long projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	@Override
	public long getProjectCompletionDate() {
		return projectCompletionDate;
	}

	@Override
	public void setProjectCompletionDate(long projectCompletionDate) {
		this.projectCompletionDate = projectCompletionDate;
	}

	@Override
	public String getSalesDepartment() {
		return salesDepartment;
	}

	@Override
	public void setSalesDepartment(String salesDepariment) {
		this.salesDepartment = salesDepariment;
	}

	@Override
	public long getSignedDate() {
		return signedDate;
	}

	@Override
	public void setSignedDate(long signedDate) {
		this.signedDate = signedDate;
	}

	@Override
	public String[] getSalesEmployees() {
		return salesEmployees;
	}

	@Override
	public void setSalesEmployees(String[] salsEmployees) {
		this.salesEmployees = salsEmployees;
	}

	@Override
	public String[] getSupportsDepartments() {
		return supportsDepartments;
	}

	@Override
	public void setSupportsDepartments(String[] supportsDepartments) {
		this.supportsDepartments = supportsDepartments;
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
	public FileEntry[] getAttachments() {
		return attachments;
	}

	@Override
	public void setAttachments(FileEntry[] attachments) {
		this.attachments = attachments;
	}
}
