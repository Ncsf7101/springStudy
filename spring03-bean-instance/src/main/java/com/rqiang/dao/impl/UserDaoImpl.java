package com.rqiang.dao.impl;

import com.rqiang.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
