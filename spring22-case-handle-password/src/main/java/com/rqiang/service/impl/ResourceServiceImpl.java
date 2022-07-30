package com.rqiang.service.impl;

import com.rqiang.dao.ResourceDao;
import com.rqiang.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourceDao.readResources(url, password);
    }
}
