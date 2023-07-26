package com.linkgie.lowcode.demo.contracts.web;

import com.linkgie.galaxyframework.utils.CollectionUtils;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.demo.contracts.web.model.BusinessEmployeeVO;
import com.linkgie.lowcode.demo.contracts.web.model.JobLevel;

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
        personVO1.setBusness("汽车行业");
        personVO1.setLevel(JobLevel.DIRECTOR);

        BusinessEmployeeVO personVO2 = new BusinessEmployeeVO();
        personVO2.setId("2");
        personVO2.setName("李四");
        personVO2.setBusness("汽车行业");
        personVO2.setLevel(JobLevel.INTERMEDIATE);

        BusinessEmployeeVO personVO3 = new BusinessEmployeeVO();
        personVO3.setId("3");
        personVO3.setName("王五");
        personVO3.setBusness("医药行业");
        personVO3.setLevel(JobLevel.DIRECTOR);

        BusinessEmployeeVO personVO4 = new BusinessEmployeeVO();
        personVO4.setId("4");
        personVO4.setName("赵六");
        personVO4.setBusness("中小企业");
        personVO4.setLevel(JobLevel.INTERMEDIATE);

        BusinessEmployeeVO personVO5 = new BusinessEmployeeVO();
        personVO5.setId("5");
        personVO5.setName("陈七");
        personVO5.setBusness("零售行业");
        personVO5.setLevel(JobLevel.JUNIOR);

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
