package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String sysid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sysid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}