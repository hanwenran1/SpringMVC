package com.vito.mvc.controller;

import com.vito.mvc.bean.Department;
import com.vito.mvc.dao.DepartmentMapper;
import com.vito.mvc.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    @Autowired
    DepartmentMapper departmentMapper;
    /**
     *查询部门信息
     * @return
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Object getDepts(){
        List<Department> depts = departmentService.getAll();
//        departmentMapper.insertSelective(new Department(4,"运维部"));
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("deptID", depts.get(0).getDeptId());
        map.put("deptName", depts.get(0).getDeptName());//json
        return map;
    }
}
