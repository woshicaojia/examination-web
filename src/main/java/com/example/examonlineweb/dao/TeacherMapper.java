package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(String sysid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String sysid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}