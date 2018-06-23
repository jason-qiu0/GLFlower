package com.example.demo.dao;

import com.example.demo.entity.WebUserInfo;

public interface WebUserInfoDao {
    int webLogin(WebUserInfo webUserInfo);
    boolean updateMangerInfo(WebUserInfo webUserInfo);
    
}
