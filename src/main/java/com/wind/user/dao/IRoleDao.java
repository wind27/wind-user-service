package com.wind.user.dao;


import com.wind.dao.IBaseDao;
import com.wind.user.model.Role;

import java.util.List;

/**
 * IRoleDao
 *
 * @author qianchun 17/7/26
 **/
public interface IRoleDao extends IBaseDao<Role, Long> {
    List<Role> findByUserId(long userId);
}
