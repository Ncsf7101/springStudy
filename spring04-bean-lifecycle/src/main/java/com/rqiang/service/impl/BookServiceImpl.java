package com.rqiang.service.impl;

import com.rqiang.dao.BookDao;
import com.rqiang.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    /**初始化容器
     * 1.创建对象（内存分配）
     * 2.执行构造方法
     * 3.执行属性注入（set操作）
     * 4.执行bean初始化方法
     * 使用bean
     * 1.执行业务操作
     * 关闭/销毁容器
     * 1.执行bean销毁方法
     */

    private BookDao bookDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao){
        System.out.println("set...");
        this.bookDao = bookDao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }
}
