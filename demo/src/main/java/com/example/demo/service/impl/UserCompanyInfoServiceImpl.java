package com.example.demo.service.impl;

import com.example.demo.dao.UserCompanyInfoDao;
import com.example.demo.entity.UserCompanyInfo;
import com.example.demo.service.IUserCompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserCompanyInfoServiceImpl implements IUserCompanyInfoService {
    @Autowired
    private UserCompanyInfoDao userCompanyInfoDao;

    @Transactional
    @Override
    public boolean saveUserCompanyInfo(UserCompanyInfo info){
        return userCompanyInfoDao.saveUserCompanyInfo(info);
    }

    @Transactional
    @Override
    public UserCompanyInfo getUserCompanyInfo(String phone){
        return userCompanyInfoDao.getUserCompanyInfo(phone);
    }

    @Transactional
    @Override
    public  boolean updateUserCompanyInfo(UserCompanyInfo info){ return userCompanyInfoDao.updateUserCompanyInfo(info);
    }

    @Transactional
    @Override
    public  boolean deleteUserCompanyInfo(String phone){
        return userCompanyInfoDao.deleteUserCompanyInfo(phone);
    }
}
