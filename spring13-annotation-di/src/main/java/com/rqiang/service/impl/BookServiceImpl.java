package com.rqiang.service.impl;

import com.rqiang.dao.BookDao;
import com.rqiang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired //暴力反射直接暴力加值,如修改访问方式
    @Qualifier("bookDao") //优先级又高于Autowired自带查找
    private BookDao bookDao2; //自动装配,先查找参数名字,后查找参数类型

//    @Autowired
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao2.save();
    }
}
