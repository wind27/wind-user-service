package com.wind.user.service.impl;

import com.wind.user.dao.IUserDao;
import com.wind.user.dao.impl.UserRoleDao;
import com.wind.user.model.User;
import com.wind.user.model.UserRole;
import com.wind.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 *
 * @author qianchun 17/9/18
 **/
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Autowired
    private UserRoleDao userRoleDao;

    public User findById(long id) {
        return userDao.findById(id);
    }

    public boolean save(User user) {
        return userDao.insert(user);
    }

    public boolean save(UserRole userRole) {
        return userRoleDao.insert(userRole);
    }

    public boolean batchSave(List<UserRole> userRoleList) {
        return userRoleDao.batchInsert(userRoleList);
    }
}
