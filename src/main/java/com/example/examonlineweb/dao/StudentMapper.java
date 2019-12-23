package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.Student;
import com.github.pagehelper.Page;

import java.util.Map;

public interface StudentMapper {
    int deleteByPrimaryKey(String sysId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sysId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    //通过studentId查询
    Student findByStudentId(String studentId);

    //学生分页，带条件
    Page<Student> findByPage(Map<String,Object> conditions);
}