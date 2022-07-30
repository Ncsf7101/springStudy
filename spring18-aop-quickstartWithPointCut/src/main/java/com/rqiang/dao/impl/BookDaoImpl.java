package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //@Autowired 就这些可以,@Bean有点难装配、一般系统自己装配进去
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("bookDao save...");

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
