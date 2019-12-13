package com.example.examonlineweb.dao;

import com.example.examonlineweb.entity.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}