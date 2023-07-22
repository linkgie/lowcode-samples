package com.linkgie.lowcode.dev.platform.demo.data;

import com.linkgie.galaxyframework.fileservice.FileEntry;
import com.linkgie.galaxyframework.metadata.DataInterface;

@DataInterface(topic = "其他信息")
public interface ContractOtherInfo {
    String getRemark();

    void setRemark(String remark);

    FileEntry[] getAnnex();

    void setAnnex(FileEntry[] annex);
}
