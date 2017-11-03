package com.wind.user.dao;



import com.wind.dao.IBaseDao;
import com.wind.user.model.Permission;

import java.util.List;

/**
 * IPermissionDao
 *
 * @author qianchun 17/7/26
 **/
public interface IPermissionDao extends IBaseDao<Permission, Long> {
    List<Permission> findByRoleIds(List<Long> roleIds);
    List<Permission> findByRoleId(long roleId);
    List<Permission> findByUserId(long roleId);
}
