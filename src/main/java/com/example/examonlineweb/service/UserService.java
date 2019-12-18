package com.example.examonlineweb.service;

import com.example.examonlineweb.entity.User;

public interface UserService {
    User findByUsername(String username);
}
