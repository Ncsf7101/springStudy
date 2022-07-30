package com.rqiang;


import com.rqiang.dao.AccountDao;

import com.rqiang.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.bak";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //List<User> users = sqlSession.selectList("com.rqiang.mapper.UserMapper.selectAll"); //入门开发
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class); //代理开发
        Account ac = accountDao.findById(1);
        System.out.println(ac);
        sqlSession.close();
    }
}
