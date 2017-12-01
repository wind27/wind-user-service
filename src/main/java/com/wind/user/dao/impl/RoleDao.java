package com.wind.user.dao.impl;


import com.wind.annotation.DAO;
import com.wind.auth.model.Role;
import com.wind.dao.impl.BaseDao;
import com.wind.user.dao.IRoleDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * RoleDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "wind_auth")
@Repository
public class RoleDao extends BaseDao<Role, Long> implements IRoleDao {
    private static final String namespace = Role.class.getName();

    public List<Role> findByUserId(long userId) {
        return super.getSqlSession().selectList(namespace+".findByUserId", userId);
    }
}
