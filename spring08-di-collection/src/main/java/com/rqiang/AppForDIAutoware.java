package com.rqiang;

import com.rqiang.dao.BookDao;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIAutoware {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ctx.registerShutdownHook(); //注册关闭钩子，在jvm虚拟机关闭之前关闭
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        ctx.close();  //比较暴力
        //具体关闭操作，在Tomcat里面实现
    }
}
