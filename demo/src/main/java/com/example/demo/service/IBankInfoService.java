package com.example.demo.service;

import com.example.demo.entity.BankInfo;

public interface IBankInfoService {
    public boolean SaveBankInfo(BankInfo bankInfo);
    public BankInfo getBankInfo(String phone);
    public   boolean deleteBankinfo(String phone);
    
}
