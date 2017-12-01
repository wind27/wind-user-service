package com.wind.user.dao.impl;

import com.wind.annotation.DAO;
import com.wind.auth.model.App;
import com.wind.dao.impl.BaseDao;
import com.wind.user.dao.IAppDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AppDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "wind_auth")
@Repository
public class AppDao extends BaseDao<App, Long> implements IAppDao {
    private static final String namespace = App.class.getName();

    public List<App> findAll() {
        return super.getSqlSession().selectOne(namespace+".findAll");
    }

    public List<App> findEnableApp() {
        return super.getSqlSession().selectList(namespace + ".findEnableApp");
    }
}
