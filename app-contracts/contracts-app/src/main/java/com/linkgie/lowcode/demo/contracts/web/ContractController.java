package com.linkgie.lowcode.demo.contracts.web;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.linkgie.galaxyframework.data.utils.IdGenerator;
import com.linkgie.galaxyframework.web.HttpPost;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.demo.contracts.web.model.ContractVO;

/**
 * 合同服务；
 */
@HttpService
public class ContractController {

	@Autowired
	private IdGenerator idGenerator;

	private Map<String, ContractVO> contractVOMap = new LinkedHashMap<String, ContractVO>();
	
	/**
	 * 接收前端提交的新的合同对象；
	 * 
	 * @param contractVO
	 * @return
	 */
	@HttpPost("/contract")
	public synchronized ContractVO addContract(@RequestBody ContractVO contractVO) {
		contractVO.setId(idGenerator.generateIdAsBase58());
		contractVOMap.put(contractVO.getId(), contractVO);

		String remark = contractVO.getRemark();
		if (remark == null) {
			remark = "";
		}
		remark = remark + "测试项目-" + System.currentTimeMillis();
		return contractVO;
	}
}
