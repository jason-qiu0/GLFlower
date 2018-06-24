package com.example.demo.dao;

import com.example.demo.entity.BankInfo;

public interface BankInfoDao {
      public boolean saveBank(BankInfo bankInfo);
     public  BankInfo getBankInfo(String phone);
     public  boolean deleteBankinfo(String phone);
}
