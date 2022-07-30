package com.rqiang.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.rqiang")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy //标识程序是使用 @Aspect注解开发的AOP
//@Import({JdbcConfig.class, MybatisConfig.class}) //.class文件可以不需要@Configuration
public class SpringConfig {

}
