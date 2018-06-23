package com.example.demo.dao;

import com.example.demo.entity.VerifyCodeInfo;

public interface VerifyCodeDao {
    public   boolean  insertVerifyCode(VerifyCodeInfo venifyCodeInfo);
    public   boolean deletedVerifyCode(String phone);
    public VerifyCodeInfo selectVerifyCode(String phone);

}
