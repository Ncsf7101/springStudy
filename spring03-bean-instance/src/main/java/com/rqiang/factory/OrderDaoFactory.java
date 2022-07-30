package com.rqiang.factory;

import com.rqiang.dao.OrderDao;
import com.rqiang.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
