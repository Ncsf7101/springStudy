package com.rqiang.service.impl;

import com.rqiang.dao.LogDao;
import com.rqiang.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service("Service")
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, Double money){
//        logDao.log("转账操作油" + out + "到" + in + ", 金额： " + money, new Date(new java.util.Date().getTime()));
        logDao.log("转账操作油" + out + "到" + in + ", 金额： " + money);
    }
}
