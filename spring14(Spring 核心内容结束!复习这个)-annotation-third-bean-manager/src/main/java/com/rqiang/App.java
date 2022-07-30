package com.rqiang;


import com.rqiang.dao.BookDao;
import com.rqiang.config.SpringConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        //ctx.registerShutdownHook(); //注册关闭钩子，在jvm虚拟机关闭之前关闭
//        System.out.println(dataSource);
        //具体关闭操作，在Tomcat里面实现
        //1.从类路径下加载配置文件
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BeanFactoru延迟加载Bean而 ApplicationContext是立即加载Bean  相当于<!--    lazy-init="true" 延迟加载参数--> 即加载xml即创建bean与使用才创建
        //2.从文件系统下加载配置文件
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\ncsf7\\IdeaProjects\\spring10-container\\src\\main\\resources\\applicationContext.xml");
        //3.加载多个配置文件
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", "a.xml");
//        方式一：使用bean名称
        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        方式二：使用bean名称并指定类型
//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
//        方式三：使用bean类型获取
//        BookDao bookDao = ctx.getBean(BookDao.class);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //ctx.registerShutdownHook();
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
        //ctx.close();
    }
}
