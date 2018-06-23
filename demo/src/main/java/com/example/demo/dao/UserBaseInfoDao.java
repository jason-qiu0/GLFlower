package com.example.demo.dao;

import com.example.demo.entity.UserBaseInfo;

public interface UserBaseInfoDao {
    boolean addUserRecord(UserBaseInfo userBaseInfo);

    boolean updateUserRecord(UserBaseInfo userBaseInfo);

    UserBaseInfo queryUserBaseInfoByPhone(String phone);
}
