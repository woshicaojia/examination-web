package com.example.examonlineweb.entity;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private String roleId;

    private String name;

    private String roleName;

    //权限集合
    private Set<Permission> permissions = new HashSet<>();

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }
}