package com.example.examonlineweb.service.impl;

import com.example.examonlineweb.dao.UserMapper;
import com.example.examonlineweb.entity.User;
import com.example.examonlineweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }
}
