package com.example.examonlineweb.service.impl;

import com.example.examonlineweb.dao.UserMapper;
import com.example.examonlineweb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 设置用户权限方式，spring 提供了一个 UserDetailService 接口，通过它可以获取用户信息。
 */
@Service
@Transactional
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("用户名不对！");
        }
        return user;
    }
}
