package com.wind.user.service.impl;

import com.wind.auth.model.App;
import com.wind.auth.model.LinkUserRole;
import com.wind.auth.model.User;
import com.wind.auth.service.IAppService;
import com.wind.auth.service.IUserService;
import com.wind.user.dao.IAppDao;
import com.wind.user.dao.IUserDao;
import com.wind.user.dao.impl.LinkUserRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AppService
 *
 * @author qianchun 17/9/18
 **/
@Service
public class AppService implements IAppService {

    @Autowired
    private IAppDao appDao;
    @Override
    public App save(App app) {
        return appDao.insert(app);
    }

    @Override
    public App findById(long id) {
        return appDao.findById(id);
    }
}
