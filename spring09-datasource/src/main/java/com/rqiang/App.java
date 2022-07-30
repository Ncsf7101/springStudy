package com.rqiang;


import com.rqiang.dao.BookDao;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        //ctx.registerShutdownHook(); //注册关闭钩子，在jvm虚拟机关闭之前关闭
//        System.out.println(dataSource);
        //具体关闭操作，在Tomcat里面实现
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
