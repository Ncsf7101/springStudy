package com.rqiang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration //代表applicationContext.xml Spring配置文件的壳
//设定当前类为配置类
@ComponentScan("com.rqiang")  //相当于<context:component-scan base-package="com.rqiang"/>   //14中:也可以使用此方法扫描另外的配置文件
//此注解只能添加一次,多个数据使用数组格式  @ComponentScan({"com.rqiang", "com.jx3hyun"})
//@PropertySource("jdbc2.properties")
//@PropertySource("classpath:jdbc2.properties")
//数据源,说是哪个配置文件,不支持使用*通配符 多文件用@PropertySource({"jdbc2.properties", "dasd.properties"})
@Import({JdbcConfig.class}) //.class文件可以不需要@Configuration
public class SpringConfig {
}
