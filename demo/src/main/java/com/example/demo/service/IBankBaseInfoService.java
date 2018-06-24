package com.example.demo.service;

import com.example.demo.entity.BankBaseInfo;

public interface IBankBaseInfoService {
    public boolean saveBankInfo(BankBaseInfo bankInfo);
    public BankBaseInfo getBankInfo(String phone);
    public boolean updateBankInfo(BankBaseInfo bankInfo);
    public   boolean deleteBankinfo(String phone);
}
