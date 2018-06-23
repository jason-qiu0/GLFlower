package com.example.demo.service.impl;

import com.example.demo.dao.VerifyCodeDao;
import com.example.demo.entity.VerifyCodeInfo;
import com.example.demo.service.IVerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VerifyCodeInfoServiceImpl  implements IVerifyCodeService {
    @Autowired
    private VerifyCodeDao verifyCodeDao;
    @Override
    public boolean insertVenifyCode(VerifyCodeInfo venifyCodeInfo) {
        return verifyCodeDao.insertVerifyCode(venifyCodeInfo);
    }
    @Transactional
    @Override
    public boolean deleteVenifyCode(String phone) {
        return verifyCodeDao.deletedVerifyCode(phone);
    }

    @Override
    public VerifyCodeInfo selectVerifyCode(String phone) {
        return verifyCodeDao.selectVerifyCode(phone);
    }
}
