package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String sysId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String sysId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}