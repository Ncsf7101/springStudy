package com.rqiang.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.rqiang")
@PropertySource("classpath:jdbc.properties")
//@Import({JdbcConfig.class, MybatisConfig.class}) //.class文件可以不需要@Configuration
@EnableAspectJAutoProxy //aop注解开发
public class SpringConfig {

}
