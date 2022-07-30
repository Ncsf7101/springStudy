package com.rqiang;



import com.rqiang.config.SpringConfig;
import com.rqiang.dao.BookDao;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.bak";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //List<User> users = sqlSession.selectList("com.rqiang.mapper.UserMapper.selectAll"); //入门开发
//        AccountDao accountDao = sqlSession.getMapper(AccountDao.class); //代理开发
//        Account ac = accountDao.findById(1);
//        System.out.println(ac);
//        sqlSession.close();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        int a = bookDao.select();
        System.out.println(a);
    }
}
