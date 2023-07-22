package com.linkgie.lowcode.dev.platform.demo.web;

import com.linkgie.galaxyframework.utils.CollectionUtils;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.dev.platform.demo.data.PersonVO;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@HttpService
public class PersonController {

    private Map<String, PersonVO> personVOMap = new LinkedHashMap<String, PersonVO>();

    @PostConstruct
    private void init(){
        //未连接数据库，此为模拟数据
        PersonVO personVO1 = new PersonVO();
        personVO1.setId("1");
        personVO1.setName("张三");

        PersonVO personVO2 = new PersonVO();
        personVO2.setId("2");
        personVO2.setName("李四");

        PersonVO personVO3 = new PersonVO();
        personVO3.setId("3");
        personVO3.setName("王五");

        PersonVO personVO4 = new PersonVO();
        personVO4.setId("4");
        personVO4.setName("赵六");

        PersonVO personVO5 = new PersonVO();
        personVO5.setId("5");
        personVO5.setName("陈七");

        personVOMap.put(personVO1.getId(), personVO1);
        personVOMap.put(personVO2.getId(), personVO2);
        personVOMap.put(personVO3.getId(), personVO3);
        personVOMap.put(personVO4.getId(), personVO4);
        personVOMap.put(personVO5.getId(), personVO5);
    }

    @HttpGet("/person/list")
    public synchronized PersonVO[] get(){

        return CollectionUtils.toArray(personVOMap.values(),PersonVO.class);
    }
}
