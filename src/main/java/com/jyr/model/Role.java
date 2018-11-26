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
    private String orgId ;
    private String roleName ;
    private String roleDesc ;
    private Integer isPublic ;
    private Integer isDefault ;
    private String creatorId ;
    private Date createTime ;
    private Integer status ;

    private List<Authority> authList ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRolrDesc() {
        return roleDesc;
    }

    public void setRolrDesc(String rolrDesc) {
        this.roleDesc = rolrDesc;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
