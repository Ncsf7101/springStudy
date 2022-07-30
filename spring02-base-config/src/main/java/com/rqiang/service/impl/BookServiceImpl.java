package com.rqiang.service.impl;

import com.rqiang.dao.BookDao;
import com.rqiang.service.BookService;

public class BookServiceImpl implements BookService {
//    5.删除业务层中使用new的方式创建的dao对象
//    private BookDao bookDao = new BooskDaoImpl();
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
    }

//    6. 提供对应的set方法
    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }
}
