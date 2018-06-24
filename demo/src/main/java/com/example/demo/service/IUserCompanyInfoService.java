package com.example.demo.service;

import com.example.demo.entity.UserCompanyInfo;

public interface IUserCompanyInfoService {
    public boolean saveUserCompanyInfo(UserCompanyInfo info);

    public UserCompanyInfo getUserCompanyInfo(String phone);

    public  boolean updateUserCompanyInfo(UserCompanyInfo info);

    public  boolean deleteUserCompanyInfo(String phone);
}
