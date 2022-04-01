package com.vito.mvc.dao;

import com.vito.mvc.bean.Login;
import com.vito.mvc.bean.User;
import com.vito.mvc.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectBySingleExample(String tel);

    User selectByPrimaryKey(Integer id);

    List<User> selectByExample(UserExample example);

    User selectByLoginId(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}