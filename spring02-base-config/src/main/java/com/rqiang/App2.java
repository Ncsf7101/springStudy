package com.rqiang;

import com.rqiang.dao.BookDao;
import com.rqiang.service.BookService;
import com.rqiang.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
//      3. 获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        4. 获取Bean
        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookService bookService = (BookService) ctx.getBean("bookService");
        BookService bookService2 = (BookService) ctx.getBean("bookService");
        System.out.println(bookService);
        System.out.println(bookService2);


        bookService.save();
    }
}
