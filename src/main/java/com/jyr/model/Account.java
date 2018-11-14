package com.jyr.model;

/**
 * @Author: Jiang
 * @Date: Created in 16:24  2018\11\14 0014
 * @Description:
 * @Modified By:
 */
public class Account {
    private String id ;
    private String username ;
    private String accountid ;
    private String password ;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
