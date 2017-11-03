package com.wind.user.dao.impl;

import com.wind.annotation.DAO;
import com.wind.dao.impl.BaseDao;
import com.wind.user.model.RolePermission;
import org.springframework.stereotype.Repository;

/**
 * RolePermissionDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "user")
@Repository
public class RolePermissionDao extends BaseDao<RolePermission, Long> {
    private static final String namespace = RolePermission.class.getName();
}
