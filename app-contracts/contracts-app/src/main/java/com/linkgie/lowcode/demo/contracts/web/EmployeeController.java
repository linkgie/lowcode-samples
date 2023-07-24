package com.linkgie.lowcode.demo.contracts.web;

import com.linkgie.galaxyframework.utils.CollectionUtils;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.demo.contracts.web.model.BusinessEmployeeVO;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@HttpService
public class EmployeeController {

    private Map<String, BusinessEmployeeVO> personVOMap = new LinkedHashMap<String, BusinessEmployeeVO>();

    @PostConstruct
    private void init(){
        //未连接数据库，此为模拟数据
        BusinessEmployeeVO personVO1 = new BusinessEmployeeVO();
        personVO1.setId("1");
        personVO1.setName("张三");

        BusinessEmployeeVO personVO2 = new BusinessEmployeeVO();
        personVO2.setId("2");
        personVO2.setName("李四");

        BusinessEmployeeVO personVO3 = new BusinessEmployeeVO();
        personVO3.setId("3");
        personVO3.setName("王五");

        BusinessEmployeeVO personVO4 = new BusinessEmployeeVO();
        personVO4.setId("4");
        personVO4.setName("赵六");

        BusinessEmployeeVO personVO5 = new BusinessEmployeeVO();
        personVO5.setId("5");
        personVO5.setName("陈七");

        personVOMap.put(personVO1.getId(), personVO1);
        personVOMap.put(personVO2.getId(), personVO2);
        personVOMap.put(personVO3.getId(), personVO3);
        personVOMap.put(personVO4.getId(), personVO4);
        personVOMap.put(personVO5.getId(), personVO5);
    }

    @HttpGet("/employee/all")
    public synchronized BusinessEmployeeVO[] getAll(){

        return CollectionUtils.toArray(personVOMap.values(),BusinessEmployeeVO.class);
    }
}
