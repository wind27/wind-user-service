package com.wind.user.dao;

import com.wind.dao.IBaseDao;
import com.wind.user.model.User;

import java.util.List;
import java.util.Map;

/**
 *  IUserDao 接口
 */
public interface IUserDao extends IBaseDao<User, Long> {

    public List<User> find(Map<String, Object> params);
    public User findByUsername(String username);
}
