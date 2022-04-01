package com.vito.mvc.service;

import com.vito.mvc.bean.Doctor;
import com.vito.mvc.bean.Login;
import com.vito.mvc.bean.User;
import com.vito.mvc.dao.DoctorMapper;
import com.vito.mvc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询所有部门
     * @return
     */
    public List<User> getAll() {
        return userMapper.selectByExample(null);
    }

    public User checkLogin(String tel){
        return userMapper.selectBySingleExample(tel);
    }
    public User getUserByLoginId(int loginId){
        return userMapper.selectByLoginId(loginId);
    }
}
