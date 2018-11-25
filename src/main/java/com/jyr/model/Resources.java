package com.jyr.model;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("serial")
public class Resources implements Serializable {

	private String id;
	private String menu_id;
	private String res_name;//这个权限KEY是唯一的，新增时要注意，
	private String request_url;//URL地址．例如：/videoType/query　　不需要项目名和http://xxx:8080
	private String controller_name;
	private String action_name;
	private Integer status;

	private List<Authority> authList ;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getRequest_url() {
		return request_url;
	}

	public void setRequest_url(String request_url) {
		this.request_url = request_url;
	}

	public String getController_name() {
		return controller_name;
	}

	public void setController_name(String controller_name) {
		this.controller_name = controller_name;
	}

	public String getAction_name() {
		return action_name;
	}

	public void setAction_name(String action_name) {
		this.action_name = action_name;
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