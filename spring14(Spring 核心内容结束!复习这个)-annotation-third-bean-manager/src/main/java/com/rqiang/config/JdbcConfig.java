package com.rqiang.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.rqiang.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration //必须与主配置文件的@ComponentScan("com.rqiang")配对使用
//@Import({.class}).class文件可以不需要@Configuration
public class JdbcConfig {
    //1.定义一个方法获得要管理的bean
    //2.添加@bean表示当前返回的方法是一个bean
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/db_ssm")
    private String url;
    @Value("root")
    private String userName;
    @Value("123456")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao){ //引用类型注入: 定义方法设置形参,容器会根据类型自动装配对象
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
