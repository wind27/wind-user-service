package com.wind.user;

import com.alibaba.fastjson.JSON;
import com.wind.auth.model.App;
import com.wind.common.Status;
import com.wind.user.service.impl.AppService;
import com.wind.utils.JsonResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * TestController
 *
 * @author qianchun 17/11/2
 **/
@RestController
public class TestController {
    @Autowired
    private AppService appService;

    @RequestMapping("app/save")
    public String hello(HttpServletRequest request) {

        App app = new App();

        app.setName("用户管理");
        app.setHomePageUrl("wind.com");
        app.setStatus(Status.ENABLED.getValue());
        app.setCreateTime(new Date());
        app.setUpdateTime(new Date());

        app = appService.save(app);
        return JsonResponseUtil.ok(app);
    }
}
