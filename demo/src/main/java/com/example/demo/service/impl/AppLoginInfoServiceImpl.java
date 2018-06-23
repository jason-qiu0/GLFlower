package com.example.demo.service.impl;

import com.example.demo.dao.AppLoginInfoDao;
import com.example.demo.entity.AppLoginInfo;
import com.example.demo.service.IAppLoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppLoginInfoServiceImpl implements IAppLoginInfoService {
    @Autowired
    private AppLoginInfoDao appLoginInfoDao;

    @Override
    public boolean Register(AppLoginInfo appLoginInfo) {
        return appLoginInfoDao.register(appLoginInfo);
    }

    @Override
    public boolean RestUserPwd(AppLoginInfo appLoginInfo) {
        return appLoginInfoDao.RestUserPwd(appLoginInfo);
    }

    @Override
    public int AppLogin(AppLoginInfo appLoginInfo) {
        return appLoginInfoDao.AppLogin(appLoginInfo);
    }

    @Override
    public int ValidateIdCard(AppLoginInfo appLoginInfo) {
        return appLoginInfoDao.ValidateIdCard(appLoginInfo);
    }
}
