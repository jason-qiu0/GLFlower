package com.example.demo.service.impl;

import com.example.demo.dao.UserReputationDao;
import com.example.demo.entity.UserReputationBase;
import com.example.demo.service.IUserReputationBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserReputationBaseServiceImpl implements IUserReputationBaseService {
    @Autowired
    private UserReputationDao userReputationDao;

    @Transactional
    @Override
    public boolean saveUserReputationInfo(UserReputationBase info){
        return userReputationDao.saveUserReputationBase(info);
    }

    @Transactional
    @Override
    public UserReputationBase getUserReputationInfo(String phone){
        return userReputationDao.getUserReputationBase(phone);
    }

    @Transactional
    @Override
    public  boolean updateUserReputationInfo(UserReputationBase info){
        return userReputationDao.updateUserReputationBase(info);
    }

    @Transactional
    @Override
    public  boolean deleteUserReputationInfo(String phone){
        return userReputationDao.deleteUserReputationBase(phone);
    }
}
