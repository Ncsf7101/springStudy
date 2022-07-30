package com.rqiang.service.impl;

import com.rqiang.dao.AccountDao;
import com.rqiang.service.AccountService;
import com.rqiang.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    @Qualifier(value = "Service")
    private LogService logService;

    @Override
    public void transfer(String out, String in, Double money) {
        try{
            accountDao.outMoney(out, money);
//            int i = 1/0;
            accountDao.inMoney(in, money);
            logService.log(out + "Successful！", in, money);
        }catch (Exception e){
            logService.log(out + "Error！", in, money);
            throw e;
        }
//        }finally {
//            logService.log(out, in, money);
//        }
        //只有 errorzero和 notpoint 和 arraymax 等才会回滚，其他异常需要设置@Transactional(rollbackFor = {IOException.class})
        //int i = 1/0;
        //logService.log(out, in, money);

    }
}


