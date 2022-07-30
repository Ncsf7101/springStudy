package com.rqiang.dao.impl;

import com.rqiang.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("user dao save ...");
    }

    //表示bean初始化对应的操作
    public void init(){
        //System.out.println("init...");
    }

    //表示bean销毁前对应的操作
    public void destory(){
        //System.out.println("destory...");
    }
}
