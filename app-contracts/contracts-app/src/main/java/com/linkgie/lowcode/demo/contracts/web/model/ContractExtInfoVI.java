package com.linkgie.lowcode.demo.contracts.web.model;

import com.linkgie.galaxyframework.fileservice.FileEntry;
import com.linkgie.galaxyframework.metadata.DataInterface;

@DataInterface(topic = "其他信息")
public interface ContractExtInfoVI {
    String getRemark();

    void setRemark(String remark);

    FileEntry[] getAttachments();

    void setAttachments(FileEntry[] annex);
}
