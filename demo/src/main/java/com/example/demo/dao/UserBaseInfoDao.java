package com.example.demo.dao;

import com.example.demo.entity.UserBaseInfo;

public interface UserBaseInfoDao {
    boolean saveUserBaseInfo(UserBaseInfo userBaseInfo);

    boolean updateUserBaseInfo(UserBaseInfo userBaseInfo);

    UserBaseInfo getUserBaseInfo(String phone);

    boolean deleteUserBaseInfo(String phone);
}
