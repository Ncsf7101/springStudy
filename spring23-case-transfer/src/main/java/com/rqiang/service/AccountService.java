package com.rqiang.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    /**
     * 转账操作
     * @param out
     * @param in
     * @param money
     */
    @Transactional
    public void transfer(String out, String in, Double money);
}
