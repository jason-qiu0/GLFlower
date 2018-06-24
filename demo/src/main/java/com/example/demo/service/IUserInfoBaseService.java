package com.example.demo.service;

import com.example.demo.entity.UserBaseInfo;
public interface IUserInfoBaseService {

    public boolean saveUserBaseInfo(UserBaseInfo userInfo);

    public  boolean updateUserBaseInfo(UserBaseInfo userInfo);

    public  UserBaseInfo getUserBaseInfo(String phone);

    public  boolean deleteUserBaseInfo(String phone);
}
