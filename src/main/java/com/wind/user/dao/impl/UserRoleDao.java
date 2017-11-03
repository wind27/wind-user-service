package com.wind.user.dao.impl;

import com.wind.annotation.DAO;
import com.wind.dao.impl.BaseDao;
import com.wind.user.model.UserRole;
import org.springframework.stereotype.Repository;

/**
 * UserDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "user")
@Repository
public class UserRoleDao extends BaseDao<UserRole, Long> {
    private static final String namespace = UserRole.class.getName();
}
