package com.jyr.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("serial")
public class Resources implements Serializable {

	private String id;
	private String menuId;
	private String resName;//这个权限KEY是唯一的，新增时要注意，
	private String requestUrl;//URL地址．例如：/videoType/query　　不需要项目名和http://xxx:8080
	private String controllerName;
	private String actionName;
	private Integer status;

	private List<Authority> authList ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Authority> getAuthList() {
        return authList;
    }

    public void setAuthList(List<Authority> authList) {
        this.authList = authList;
    }
}