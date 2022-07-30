package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;

public class BooskDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
