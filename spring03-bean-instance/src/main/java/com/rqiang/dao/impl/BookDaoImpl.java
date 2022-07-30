package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private BookDaoImpl(){
        System.out.println("book dao constructor is running ...");
    }  //通过反射调用构造方法，使用无参构造方法

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
