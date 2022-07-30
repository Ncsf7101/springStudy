package com.rqiang.dao.impl;

import com.rqiang.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String name){
        System.out.println("id: " + id);
        //if(true) throw new NullPointerException();
        return "itcast";
    }
}
