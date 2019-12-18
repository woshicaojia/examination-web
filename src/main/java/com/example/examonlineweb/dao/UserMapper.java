package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //通过用户名来查询用户
    User findUserByUsername(String username);
}