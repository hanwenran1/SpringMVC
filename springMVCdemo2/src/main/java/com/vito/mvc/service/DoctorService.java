package com.vito.mvc.service;

import com.vito.mvc.bean.Department;
import com.vito.mvc.bean.Doctor;
import com.vito.mvc.bean.DoctorExample;
import com.vito.mvc.dao.DepartmentMapper;
import com.vito.mvc.dao.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorMapper doctorMapper;

    /**
     * 查询所有部门
     * @return
     */
    public List<Doctor> getAll() {
        return doctorMapper.selectByExample(null);
    }

    public Doctor getDoc(String name){

//        System.out.println("getDoc???"+doctorMapper.selectByName(name));
        return doctorMapper.selectByName(name);
    }

    public Doctor getDocByPrimaryKey(Integer id){

//        System.out.println("getDoc???"+doctorMapper.selectByName(name));
        return doctorMapper.selectByPrimaryKey(id);
    }

//    public List<Doctor> getDoctor(DoctorExample doc) {
//        return doctorMapper.selectByExample(doc);
//    }
}

