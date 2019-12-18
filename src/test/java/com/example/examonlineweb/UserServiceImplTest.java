package com.example.examonlineweb;

import com.example.examonlineweb.entity.Permission;
import com.example.examonlineweb.entity.Role;
import com.example.examonlineweb.entity.User;
import com.example.examonlineweb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * 用户角色权限单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void findByUsername(){
        User user = userService.findByUsername("1008611");
        Set<Role> roles = user.getRoles();
        for(Role role:roles){
            Set<Permission> permissions = role.getPermissions();
            for (Permission permission:permissions){
                System.out.println(permission.getPermissionName());
            }
            System.out.println(role.getRoleName());
        }
    }
}
