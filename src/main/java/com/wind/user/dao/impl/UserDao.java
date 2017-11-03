package com.wind.user.dao.impl;

import com.wind.annotation.DAO;
import com.wind.dao.impl.BaseDao;
import com.wind.user.dao.IUserDao;
import com.wind.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * UserDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "user")
@Repository
public class UserDao extends BaseDao<User, Long> implements IUserDao {
    private static final String namespace = User.class.getName();

    public List<User> find(Map<String, Object> params) {
        return null;
    }

    public User findByUsername(String username) {
        return super.getSqlSession().selectOne(namespace+".findByUsername", username);
    }
}
