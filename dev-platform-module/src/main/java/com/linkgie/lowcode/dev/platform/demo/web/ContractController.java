package com.linkgie.lowcode.dev.platform.demo.web;

import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpPut;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.dev.platform.demo.data.ContractVO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@HttpService
public class ContractController {


     private Map<String, ContractVO> contractVOMap = new LinkedHashMap<String, ContractVO>();

     @HttpGet("/contract/list")
     public synchronized ContractVO[] get(){
         ContractVO contractVO = new ContractVO();
         contractVO.setContract_number("CN"+new Date().getTime());
         return  new ContractVO[]{contractVO};
     }

     @HttpPut("/contract")
     public synchronized void addDemo(@RequestBody ContractVO contractVO){
         contractVO.setId("demo"+contractVOMap.size()+1);
         contractVOMap.put(contractVO.getId(),contractVO);
     }
}
