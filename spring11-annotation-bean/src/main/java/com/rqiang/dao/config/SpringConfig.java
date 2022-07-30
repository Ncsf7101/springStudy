package com.rqiang.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //代表applicationContext.xml Spring配置文件的壳
//设定当前类为配置类
@ComponentScan("com.rqiang")  //相当于<context:component-scan base-package="com.rqiang"/>
//此注解只能添加一次,多个数据使用数组格式  @ComponentScan({"com.rqiang", "com.jx3hyun"})
public class SpringConfig {
}
