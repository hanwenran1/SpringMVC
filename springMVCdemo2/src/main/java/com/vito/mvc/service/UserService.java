package com.vito.mvc.service;

import com.vito.mvc.bean.User;
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

    public User checkLogin(String openid){
        return userMapper.selectBySingleExample(openid);
    }
    public User getUserByLoginId(String loginId){
        return userMapper.selectByLoginId(loginId);
    }
}
