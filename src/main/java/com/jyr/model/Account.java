package com.jyr.model;

import java.io.Serializable;
import java.util.List;

public class Account extends SimpleUser implements Serializable {
    private List<Role> roleList ;
    private List<UserGroup> usergourpList ;
    private List<Authority> authList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<UserGroup> getUsergourpList() {
        return usergourpList;
    }

    public void setUsergourpList(List<UserGroup> usergourpList) {
        this.usergourpList = usergourpList;
    }

    public List<Authority> getAuthList() {
        return authList;
    }

    public void setAuthList(List<Authority> authList) {
        this.authList = authList;
    }
}
