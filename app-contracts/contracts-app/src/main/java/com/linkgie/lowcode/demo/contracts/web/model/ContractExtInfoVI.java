package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.fileservice.FileEntry;
import com.linkgie.galaxyframework.metadata.DataInterface;

/**
 * 项目合同的附加信息；
 * 
 * @author huanghaiquan
 *
 */
@DataInterface(topic = "其他信息")
public interface ContractExtInfoVI {

	String getRemark();

	void setRemark(String remark);

	FileEntry[] getAttachments();

	void setAttachments(FileEntry[] attachments);

	FileEntry[] getContractPages();

	void setContractPages(FileEntry[] contractPages);
}
