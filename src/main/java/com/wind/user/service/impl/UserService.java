package com.wind.user.service.impl;

import com.wind.auth.model.LinkUserRole;
import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import com.wind.user.dao.IUserDao;
import com.wind.user.dao.impl.LinkUserRoleDao;
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
    private LinkUserRoleDao linkUserRoleDao;

    public User findById(long id) {
        return userDao.findById(id);
    }

    public User save(User user) {
        return userDao.insert(user);
    }

    public LinkUserRole save(LinkUserRole linkUserRole) {
        return linkUserRoleDao.insert(linkUserRole);
    }

    public boolean batchSave(List<LinkUserRole> userRoleList) {
        return linkUserRoleDao.batchInsert(userRoleList);
    }
}
