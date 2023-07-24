package com.linkgie.lowcode.demo.contracts.web;

import com.linkgie.galaxyframework.utils.CollectionUtils;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.demo.contracts.web.model.DepartmentVO;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@HttpService
public class DepartmentController {

    private Map<String, DepartmentVO> departmentVOMap = new LinkedHashMap<String, DepartmentVO>();

    @PostConstruct
    private void init(){
        //未连接数据库，此为模拟数据
        DepartmentVO departmentVO1 = new DepartmentVO();
        departmentVO1.setId("1");
        departmentVO1.setName("市场部");

        DepartmentVO departmentVO2 = new DepartmentVO();
        departmentVO2.setId("2");
        departmentVO2.setName("销售部");

        DepartmentVO departmentVO3 = new DepartmentVO();
        departmentVO3.setId("3");
        departmentVO3.setName("行政部");

        DepartmentVO departmentVO4 = new DepartmentVO();
        departmentVO4.setId("4");
        departmentVO4.setName("总经办");

        DepartmentVO departmentVO5 = new DepartmentVO();
        departmentVO5.setId("5");
        departmentVO5.setName("财务部");

        DepartmentVO departmentVO6 = new DepartmentVO();
        departmentVO6.setId("6");
        departmentVO6.setName("技术部");

        departmentVOMap.put(departmentVO1.getId(), departmentVO1);
        departmentVOMap.put(departmentVO2.getId(), departmentVO2);
        departmentVOMap.put(departmentVO3.getId(), departmentVO3);
        departmentVOMap.put(departmentVO4.getId(), departmentVO4);
        departmentVOMap.put(departmentVO5.getId(), departmentVO5);
        departmentVOMap.put(departmentVO6.getId(), departmentVO6);
    }

    @HttpGet("/department/all")
    public synchronized DepartmentVO[] getAll(){
        return CollectionUtils.toArray(departmentVOMap.values(), DepartmentVO.class);
    }
}
