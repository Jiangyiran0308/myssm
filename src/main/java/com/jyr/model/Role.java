package com.jyr.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: Jiang
 * @Date: Created in 15:23  2018\11\21 0021
 * @Description:
 * @Modified By:
 */
public class Role implements Serializable {
    private String id ;
    private String org_id ;
    private String role_name ;
    private String rolr_desc ;
    private boolean is_public ;
    private boolean is_defaule ;
    private String creator_id ;
    private Date create_time ;
    private Integer status ;

    private List<Authority> authList ;

    public List<Authority> getAuthList() {
        return authList;
    }

    public void setAuthList(List<Authority> authList) {
        this.authList = authList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRolr_desc() {
        return rolr_desc;
    }

    public void setRolr_desc(String rolr_desc) {
        this.rolr_desc = rolr_desc;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }

    public boolean isIs_defaule() {
        return is_defaule;
    }

    public void setIs_defaule(boolean is_defaule) {
        this.is_defaule = is_defaule;
    }

    public String getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(String creator_id) {
        this.creator_id = creator_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public boolean getStatus() {
        return status !=0;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
