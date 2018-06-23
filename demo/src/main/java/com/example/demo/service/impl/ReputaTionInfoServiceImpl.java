package com.example.demo.service.impl;

import com.example.demo.dao.ReputaTionInfoDao;
import com.example.demo.entity.ReputaTionInfo;
import com.example.demo.service.IReputaTionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReputaTionInfoServiceImpl implements IReputaTionInfoService {
    @Autowired
    private ReputaTionInfoDao reputaTionInfoDao;
    @Transactional
    @Override
    public boolean SaveReputationDetail(ReputaTionInfo  reputaTionInfo) {
        return reputaTionInfoDao.SaveReputationDetail(reputaTionInfo);
    }

    @Override
    public ReputaTionInfo GetReputationDetail(String phone) {
        return  reputaTionInfoDao.GetReputationDetail(phone);
    }
    @Transactional
    @Override
    public boolean deleteReputationDetail(String phone) {
        return reputaTionInfoDao.deleteReputationDetail(phone);
    }
    @Transactional
    @Override
    public boolean SaveReputationDetailOne(ReputaTionInfo reputaTionInfo) {
        return reputaTionInfoDao.SaveReputationDetailOne(reputaTionInfo);
    }
}
