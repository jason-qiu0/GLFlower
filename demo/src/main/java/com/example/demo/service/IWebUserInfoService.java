package com.example.demo.service;

import com.example.demo.entity.WebUserInfo;

public interface IWebUserInfoService {
    int webLogin(WebUserInfo webUserInfo);
    boolean updateMangerInfo(WebUserInfo webUserInfo);

}
