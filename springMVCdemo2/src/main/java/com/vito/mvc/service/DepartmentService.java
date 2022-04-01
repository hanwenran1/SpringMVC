package com.vito.mvc.service;

import com.vito.mvc.bean.Department;
import com.vito.mvc.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 查询所有部门
     * @return
     */
    public List<Department> getAll() {
        return departmentMapper.selectByExample(null);
    }
}
