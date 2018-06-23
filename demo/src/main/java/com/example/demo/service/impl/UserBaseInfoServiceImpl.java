package com.example.demo.service.impl;

import com.example.demo.dao.UserBaseInfoDao;
import com.example.demo.entity.UserBaseInfo;
import com.example.demo.service.IUserInfoBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserBaseInfoServiceImpl implements IUserInfoBaseService {

    @Autowired
    private UserBaseInfoDao userBaseInfoDao;

    @Override
    public UserBaseInfo getUserBaseInfoByPhone(String phone)
    {
        return userBaseInfoDao.queryUserBaseInfoByPhone(phone);
    }

    @Transactional
    @Override
    public boolean addUserRecord(UserBaseInfo userInfo)
    {
        return userBaseInfoDao.addUserRecord(userInfo);
    }

    @Transactional
    @Override
    public boolean updateUserRecord(UserBaseInfo userInfo){
        return userBaseInfoDao.updateUserRecord(userInfo);
    }
}
