package com.xiaohulu.bean;

import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: sunxianpeng
 * \* Date: 2019/5/19
 * \* Time: 20:28
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class User {
    private  Long id;
    private Date date;

    public User() {
    }

    public User(Long id) {
        this.id = id;
        this.date = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}