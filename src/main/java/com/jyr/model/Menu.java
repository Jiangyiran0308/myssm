package com.jyr.model;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.List;

public class Menu implements Serializable {
    private String id ;
    private String menuName ;
    private String parentId ;
    private Integer level ;
    private Integer sort ;
    private String icon ;
    private String url ;
    private String status ;

    private List<Menu> children ;

    private List<Resources> resList ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Resources> getResList() {
        return resList;
    }

    public void setResList(List<Resources> resList) {
        this.resList = resList;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
