package com.xiaohulu.controller;

import com.xiaohulu.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: sunxianpeng
 * \* Date: 2019/5/19
 * \* Time: 20:26
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class UserController {
//http://localhost:8081/user/1000
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println("==========provider=======");
        return  new User(id);
    }
}