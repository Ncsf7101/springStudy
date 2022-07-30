package com.rqiang.service;

import com.rqiang.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
//
    @Autowired
    private AccountService accountService;
//
//    @Test
//    public void testFindById(){
//        System.out.println(accountService.findById(1));
//    }
//    @Test
//    public void testFindAll(){
//        System.out.println(accountService.findAll());
//    }
    @Test
    public void testTransfer() throws IOException{
        accountService.transfer("Tom", "Jerry", 1000D);
    }
}