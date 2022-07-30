package com.rqiang.factory;

import com.rqiang.dao.UserDao;
import com.rqiang.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
