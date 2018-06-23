package com.example.demo.service;

import com.example.demo.entity.UserBaseInfo;

public interface IUserInfoBaseService {

    boolean addUserRecord(UserBaseInfo userInfo);

    boolean updateUserRecord(UserBaseInfo userInfo);

    UserBaseInfo getUserBaseInfoByPhone(String phone);
}
