package com.linkgie.lowcode.demo.contracts.web;

import com.linkgie.galaxyframework.data.utils.IdGenerator;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpPut;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.demo.contracts.web.model.ContractVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@HttpService
public class ContractController {

	@Autowired
	private IdGenerator idGenerator;

	private Map<String, ContractVO> contractVOMap = new LinkedHashMap<String, ContractVO>();

	
	@HttpGet("/contract/all")
	public synchronized ContractVO[] getAll() {
		ContractVO contractVO = new ContractVO();
		contractVO.setCode("CN" + new Date().getTime());
		return new ContractVO[] { contractVO };
	}

	@HttpPut("/contract")
	public synchronized void addContract(@RequestBody ContractVO contractVO) {
         contractVO.setId(idGenerator.generateIdAsBase58());
		contractVOMap.put(contractVO.getId(), contractVO);
	}
}
