package com.rqiang.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //@Autowired 就这些可以,@Bean有点难装配、一般系统自己装配进去
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        //记录程序当前执行的执行（开始时间）
        Long starTime = System.currentTimeMillis();
        //业务执行万次
        for(int i = 0; i<10000; i++){
            System.out.println("bookDao save...");
        }
        //记录程序当前执行时间(结束时间)
        Long endTime = System.currentTimeMillis();
        //计算时间差
        Long totalTime = endTime - starTime;
        //输出信息
        System.out.println("执行万次消耗时间: " + totalTime + "ms");
    }
//AOP在不惊动原始程序的基础上，对其进行功能增强
    //Spring理念：无侵入式编程
    public void update() {
        System.out.println("book dao update...");
    }

    public void delete() {
        System.out.println("book dao delete...");
    }

    public void select() {
        System.out.println("book dao select...");
    }
}
