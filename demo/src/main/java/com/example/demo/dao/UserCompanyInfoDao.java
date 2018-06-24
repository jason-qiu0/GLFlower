package com.example.demo.dao;

import com.example.demo.entity.UserCompanyInfo;

public interface UserCompanyInfoDao {
    public boolean saveUserCompanyInfo(UserCompanyInfo info);
    public UserCompanyInfo getUserCompanyInfo(String phone);
    public boolean updateUserCompanyInfo(UserCompanyInfo info);
    public boolean deleteUserCompanyInfo(String phone);
}
