package com.jyr.model;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

/**
 * @Author: Jiang
 * @Date: Created in 14:06  2018\11\21 0021
 * @Description:
 * @Modified By:
 */
public class SimpleUser implements UserDetails{

    private static final long serialVersionUID = -6498309642739707784L;

    private String id ;
    private String username ;
    private String name ;
    private String password ;
    private String avatar ;
    private String creatorId ;
    private Date createTime ;
    private Integer status ;
    private boolean accountNonExpired ;//是否过期
    private boolean accountNonLocked ;//是否锁定
    private boolean credentialsNonExpired ;//证书是否过期


    private Collection<GrantedAuthority> authorities;

//    @JsonIgnore
//    private Set<Sys>


    public String getUserId() {
        return id;
    }

    public void setUserId(String userId) {
        this.id = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvater() {
        return avatar;
    }

    public void setAvater(String avater) {
        this.avatar = avater;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String getCreator_id() {
        return creatorId;
    }

    public void setCreator_id(String creator_id) {
        this.creatorId = creator_id;
    }

    public Date getCreate_time() {
        return createTime;
    }

    public void setCreate_time(Date create_time) {
        this.createTime = create_time;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.status != 0;
    }
}
