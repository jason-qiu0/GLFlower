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
    public UserBaseInfo getUserBaseInfo(String phone)
    {
        return userBaseInfoDao.getUserBaseInfo(phone);
    }

    @Transactional
    @Override
    public boolean saveUserBaseInfo(UserBaseInfo userInfo)
    {
        return userBaseInfoDao.saveUserBaseInfo(userInfo);
    }

    @Transactional
    @Override
    public boolean updateUserBaseInfo(UserBaseInfo userInfo){
        return userBaseInfoDao.updateUserBaseInfo(userInfo);
    }

    @Transactional
    @Override
    public  boolean deleteUserBaseInfo(String phone){return userBaseInfoDao.deleteUserBaseInfo(phone);}
}
