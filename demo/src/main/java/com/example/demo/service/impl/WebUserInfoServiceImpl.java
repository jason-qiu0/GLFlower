package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.WebUserInfoDao;
import com.example.demo.entity.WebUserInfo;
import com.example.demo.service.IWebUserInfoService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WebUserInfoServiceImpl implements IWebUserInfoService {
    @Autowired
    private WebUserInfoDao webUserInfoDao;
    @Override
    public int webLogin(WebUserInfo webUserInfo) {

        return webUserInfoDao.webLogin(webUserInfo);
    }
    @Transactional
    @Override
    public boolean updateMangerInfo(WebUserInfo webUserInfo) {
        return webUserInfoDao.updateMangerInfo(webUserInfo);
    }
}
