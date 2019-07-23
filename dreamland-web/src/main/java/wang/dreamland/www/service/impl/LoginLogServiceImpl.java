
/*
 * Copyright (C) 2013-2016 ShangHai DoIT Network
 * All rights reserved.
 * ShangHai DoIt Network
 */
package wang.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.dreamland.www.dao.LoginLogMapper;
import wang.dreamland.www.entity.LoginLog;
import wang.dreamland.www.service.LoginLogService;

import java.util.List;

/**
 * dreamland-wang.dreamland.www.service.impl
 * created by LI LICHUNYAN at 2019/7/20
 */

@Service
public class LoginLogServiceImpl implements LoginLogService {
    
    @Autowired
    private LoginLogMapper loginLogMapper;

    @Transactional
    public int add(LoginLog loginLog) {
        return loginLogMapper.insert( loginLog );
    }

    @Override
    public List<LoginLog> findAll() {
        return loginLogMapper.select(null);
    }

    @Override
    public List<LoginLog> findByUid(Long uid) {
        LoginLog loginLog = new LoginLog();
        loginLog.setUserid(uid);
        return loginLogMapper.select(loginLog);
    }
}

