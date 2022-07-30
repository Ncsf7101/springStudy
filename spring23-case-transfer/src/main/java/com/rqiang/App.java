package com.rqiang;


import com.rqiang.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

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
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ResourceService resourceService = ctx.getBean(ResourceService.class);
//        boolean flag = resourceService.openURL("http://www.baidu.com/hh", "12345678  ");
//        System.out.println(flag);
    }
}
