package com.jyr.dao;

import com.jyr.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    List<Role> selectAll() ;
    Role selectById(@Param("id")String id) ;
    List<Role> selectByAccountId(@Param("id")String id);
    List<Role> selectByUserGroupId(@Param("id")String id);
    List<Role> selectByAuthId(@Param("id")String id) ;

}
