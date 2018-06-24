package com.example.demo.dao;

import com.example.demo.entity.BankBaseInfo;

public interface BankBaseInfoDao {
    public boolean saveBank(BankBaseInfo bankInfo);
    public BankBaseInfo getBankInfo(String phone);
    public boolean updateBankBaseInfo(BankBaseInfo info);
    public  boolean deleteBankinfo(String phone);
}
