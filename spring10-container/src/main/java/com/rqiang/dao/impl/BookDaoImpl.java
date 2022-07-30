package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;

import java.util.*;

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

    //表示bean初始化对应的操作
    public void init(){
        //System.out.println("init...");
    }

    //表示bean销毁前对应的操作
    public void destory(){
        //System.out.println("destory...");
    }
}
