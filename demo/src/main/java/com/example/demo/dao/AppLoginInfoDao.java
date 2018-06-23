package com.example.demo.dao;

import com.example.demo.entity.AppLoginInfo;
import org.apache.ibatis.annotations.Param;

public interface AppLoginInfoDao {
    public boolean register(AppLoginInfo appLoginInfo);
    public boolean RestUserPwd(AppLoginInfo appLoginInfo);
    public int AppLogin(AppLoginInfo appLoginInfo);
    public  int ValidateIdCard(AppLoginInfo appLoginInfo );
}
