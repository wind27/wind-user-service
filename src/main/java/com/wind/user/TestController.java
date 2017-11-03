package com.wind.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * TestController
 *
 * @author qianchun 17/11/2
 **/
@RestController
public class TestController {
    @Value("${user.jdbc.driverClassName:test_abc}")
    private String driverName;

    @RequestMapping("consumer")
    public String hello(HttpServletRequest request) {
        System.out.println("_--------------------_:driverName:"+driverName);
        return "consumer";
    }
}
