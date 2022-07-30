package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

/**
 * @Spring提供@Component注解的三个衍生注解
 * @Controller: 用于表现层bean定义
 * @Service: 用于业务层bean定义
 * @Respository: 用于数据层bean定义
 */
//@Repository //按类型查找,无法按名称查找
@Repository("bookDao")  //可以通过名称查找或者类型查找都行
@Scope("singleton")
public class BookDaoImpl implements BookDao {
//    private int connectionNum;
//    private String databaseName;
//
//    public BookDaoImpl(int connectionNum, String databaseName) {
//        this.connectionNum = connectionNum;
//        this.databaseName = databaseName;
//    }
//    private int[] array;
//    private List<String> list;
//    private Set<String> set;
//    private Map<String, String> map;
//    private Properties properties;
//
//    public void setArray(int[] array) {
//        this.array = array;
//    }
//
//    public void setList(List<String> list) {
//        this.list = list;
//    }
//
//    public void setSet(Set<String> set) {
//        this.set = set;
//    }
//
//    public void setMap(Map<String, String> map) {
//        this.map = map;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }


    public BookDaoImpl() {
        System.out.println("constructor");

    }

    @Override
    public void save() {
//        System.out.println("book dao save ...");
//        System.out.println("遍历数组：" + Arrays.toString(array));
//        System.out.println("遍历List" + list);
//        System.out.println("遍历Set" + set);
//        System.out.println("遍历Map" + map);
//        System.out.println("遍历Properties" + properties);

        System.out.println("book dao save ...");
        //System.out.println("book dao save ..." + databaseName + ", " + connectionNum);
    }

    @PostConstruct
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("destory...");
    }
}
