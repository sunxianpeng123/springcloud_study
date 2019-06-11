package com.xiaohulu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: sunxianpeng
 * \* Date: 2019/5/20
 * \* Time: 20:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:部门实体类
 * \ *
 */
@AllArgsConstructor//constructor
@NoArgsConstructor//constructor
@Data//getter,setter
@Accessors(chain = true)
public class Dept implements Serializable{//列表关系映射，orm思想
    /**
     *  部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;

    public  static  void main(String [] args){
        Dept dept=new Dept();
    }

}