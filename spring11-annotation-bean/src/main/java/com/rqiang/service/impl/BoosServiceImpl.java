package com.rqiang.service.impl;

import com.rqiang.dao.BookDao;
import com.rqiang.service.BoosService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Spring提供@Component注解的三个衍生注解
 * @Controller: 用于表现层bean定义
 * @Service: 用于业务层bean定义
 * @Respository: 用于数据层bean定义
 */

@Service //按类型查找,无法按名称查找
public class BoosServiceImpl implements BoosService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("service save...");
    }
}
