package com.rqiang.factory;

import com.rqiang.dao.UserDao;
import com.rqiang.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

//    修改默认单例或者非单例，false非单例，true单例。(当然IOC容器Bean标签中的scope也可以改)
//    @Override
//    public boolean isSingleton() {
//        return false|true;
//    }
}
