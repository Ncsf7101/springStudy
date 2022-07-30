package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + databaseName + ", " + connectionNum);
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
