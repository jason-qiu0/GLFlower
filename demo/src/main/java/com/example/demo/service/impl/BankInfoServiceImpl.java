package com.example.demo.service.impl;

import com.example.demo.dao.BankInfoDao;
import com.example.demo.entity.BankInfo;
import com.example.demo.service.IBankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankInfoServiceImpl implements IBankInfoService {
     @Autowired
     private BankInfoDao bankInfoDao;
    @Transactional
    @Override
    public boolean SaveBankInfo(BankInfo bankInfo) {
        return bankInfoDao.saveBank(bankInfo);
    }

    @Override
    public BankInfo getBankInfo(String phone) {
        return bankInfoDao.getBankInfo(phone);
    }
    @Transactional
    @Override
    public boolean deleteBankinfo(String phone) {
        return bankInfoDao.deleteBankinfo(phone);
    }
}
