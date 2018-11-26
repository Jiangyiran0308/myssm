package com.jyr.model;

import java.io.Serializable;
import java.util.List;

public class Authority implements Serializable {
    private String id ;
    private String summary ;
    private String authName ;

    private List<Menu> menuList ;

    private List<Resources> resList ;

    public List<Resources> getResList() {
        return resList;
    }

    public void setResList(List<Resources> resList) {
        this.resList = resList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }
}
