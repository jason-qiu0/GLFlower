package com.example.demo.service.impl;

import com.example.demo.dao.UserContactsBaseDao;
import com.example.demo.entity.UserContactsBase;
import com.example.demo.service.IUserContactsBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserContactsBaseServiceImpl implements IUserContactsBaseService {
    @Autowired
    private UserContactsBaseDao userContactsBaseDao;

    @Transactional
    @Override
    public boolean saveUserContactsBase(UserContactsBase info){
        return userContactsBaseDao.saveUserContactsBase(info);
    }

    @Transactional
    @Override
    public UserContactsBase getUserContactsBase(String phone){
        return userContactsBaseDao.getUserContactsBase(phone);
    }

    @Transactional
    @Override
    public  boolean updateUserContactsBase(UserContactsBase info){ return userContactsBaseDao.updateUserContactsBase(info);
    }

    @Transactional
    @Override
    public  boolean deleteUserContactsBase(String phone){
        return userContactsBaseDao.deleteUserContactsBase(phone);
    }
}
