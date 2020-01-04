package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Permission;
import com.zking.eurekaprovider.model.Role;
import com.zking.eurekaprovider.model.User;

import java.util.List;
import java.util.Set;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Permission> listPermissionsByUserName(User user);//查询指定用户拥有的权限




   Role listRolesByUserName(User user);//查询指定用户拥有的角色


    User  selectBykey(User user);
}