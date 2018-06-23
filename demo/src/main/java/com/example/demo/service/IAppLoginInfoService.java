package com.example.demo.service;

import com.example.demo.entity.AppLoginInfo;
import org.springframework.stereotype.Service;


public interface IAppLoginInfoService {
    public boolean Register(AppLoginInfo appLoginInfo);
    public  boolean RestUserPwd(AppLoginInfo appLoginInfo);
    public   int AppLogin(AppLoginInfo appLoginInfo);
    public  int  ValidateIdCard(AppLoginInfo appLoginInfo);
}
