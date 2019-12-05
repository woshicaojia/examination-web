package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.Subject;

public interface SubjectMapper {
    int deleteByPrimaryKey(String sysid);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(String sysid);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}