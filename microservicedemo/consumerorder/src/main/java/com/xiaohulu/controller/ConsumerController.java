package com.xiaohulu.controller;

import com.xiaohulu.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: sunxianpeng
 * \* Date: 2019/5/19
 * \* Time: 20:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class ConsumerController {
//    spring 提供的用于访问rest接口的模板对象
    @Autowired
    private RestTemplate restTemplate;
    private String url ="http://localhost:8081/user/";
    @RequestMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
//访问提供者 获取数据
        User user = restTemplate.getForObject(url + id, User.class);
        System.out.println("==========consumer=======");
        return user;
    }
}