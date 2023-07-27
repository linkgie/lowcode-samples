package com.linkgie.lowcode.demo.contracts.web;

import com.linkgie.galaxyframework.utils.CollectionUtils;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpService;
import com.linkgie.lowcode.demo.contracts.web.model.BusinessDepartmentVO;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@HttpService
public class DepartmentController {

    private Map<String, BusinessDepartmentVO> departmentVOMap = new LinkedHashMap<String, BusinessDepartmentVO>();

    /**
     * 初始化测试数据；
     */
    @PostConstruct
    private void init(){
        //未连接数据库，此为模拟数据
        BusinessDepartmentVO departmentVO1 = new BusinessDepartmentVO();
        departmentVO1.setId("1");
        departmentVO1.setName("市场部");

        BusinessDepartmentVO departmentVO2 = new BusinessDepartmentVO();
        departmentVO2.setId("2");
        departmentVO2.setName("销售部");

        BusinessDepartmentVO departmentVO3 = new BusinessDepartmentVO();
        departmentVO3.setId("3");
        departmentVO3.setName("行政部");

        BusinessDepartmentVO departmentVO4 = new BusinessDepartmentVO();
        departmentVO4.setId("4");
        departmentVO4.setName("总经办");

        BusinessDepartmentVO departmentVO5 = new BusinessDepartmentVO();
        departmentVO5.setId("5");
        departmentVO5.setName("财务部");

        BusinessDepartmentVO departmentVO6 = new BusinessDepartmentVO();
        departmentVO6.setId("6");
        departmentVO6.setName("技术部");

        departmentVOMap.put(departmentVO1.getId(), departmentVO1);
        departmentVOMap.put(departmentVO2.getId(), departmentVO2);
        departmentVOMap.put(departmentVO3.getId(), departmentVO3);
        departmentVOMap.put(departmentVO4.getId(), departmentVO4);
        departmentVOMap.put(departmentVO5.getId(), departmentVO5);
        departmentVOMap.put(departmentVO6.getId(), departmentVO6);
    }

    /**
     * 返回候选的部门清单；
     * 
     * @return
     */
    @HttpGet("/department/all")
    public synchronized BusinessDepartmentVO[] getAll(){
        return CollectionUtils.toArray(departmentVOMap.values(), BusinessDepartmentVO.class);
    }
}
