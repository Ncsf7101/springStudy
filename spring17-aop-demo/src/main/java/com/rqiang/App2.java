package com.rqiang;

import com.alibaba.druid.pool.DruidDataSource;
import com.rqiang.config.SpringConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.activation.DataSource;

public class App2 {

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        AccountService accountService = ctx.getBean(AccountService.class);
//
//        Account ac = accountService.findById(2);
//
//        System.out.println(ac);
    }
}
