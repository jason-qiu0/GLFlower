package com.example.demo.service.impl;

import com.example.demo.dao.UserContactsDao;
import com.example.demo.entity.UserContacts;
import com.example.demo.service.IUserContactsService;
import com.example.demo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserContacstServiceImpl  implements IUserContactsService{
    @Autowired
    private UserContactsDao userContactsDao;
    @Transactional
    @Override
    public boolean insertUserContacts(UserContacts userContacts) {
        boolean flag=userContactsDao.insertUserContacts(userContacts) ;
        return flag;
    }
    @Transactional
    @Override
    public boolean updateUserContacts(UserContacts userContacts) {

        return userContactsDao.updateUserContacts(userContacts);
    }

    @Override
    public UserContacts GetContacts( String phone) {
        return userContactsDao.GetContacts(phone);
    }

    @Override
    public Integer selectUserContacts(String phone) {
        return userContactsDao.selectUserContacts(phone);
    }
}
