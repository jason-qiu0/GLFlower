package com.example.demo.service.impl;

import com.example.demo.dao.BankBaseInfoDao;
import com.example.demo.entity.BankBaseInfo;
import com.example.demo.service.IBankBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankBaseInfoServiceImpl implements IBankBaseInfoService {
     @Autowired
     private BankBaseInfoDao bankBaseInfoDao;
    @Transactional
    @Override
    public boolean saveBankInfo(BankBaseInfo bankInfo) {
        return bankBaseInfoDao.saveBank(bankInfo);
    }

    @Override
    public BankBaseInfo getBankInfo(String phone) {
        return bankBaseInfoDao.getBankInfo(phone);
    }

    @Transactional
    @Override
    public boolean updateBankInfo(BankBaseInfo bankInfo){
        return bankBaseInfoDao.updateBankBaseInfo(bankInfo);
    }

    @Transactional
    @Override
    public boolean deleteBankinfo(String phone) {
        return bankBaseInfoDao.deleteBankinfo(phone);
    }
}
