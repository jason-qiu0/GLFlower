package com.example.demo.service;

import com.example.demo.entity.VerifyCodeInfo;

public interface IVerifyCodeService {
    public  boolean insertVenifyCode(VerifyCodeInfo venifyCodeInfo);
    public  boolean deleteVenifyCode(String phone);
    public VerifyCodeInfo selectVerifyCode(String phone);
}
