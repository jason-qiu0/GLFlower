package com.example.demo.service;

import com.example.demo.entity.ReputaTionInfo;

import javax.smartcardio.Card;

public interface IReputaTionInfoService {
    public  boolean SaveReputationDetail(ReputaTionInfo reputaTionInfo);
    public  ReputaTionInfo GetReputationDetail(String phone);
    boolean   deleteReputationDetail(String phone);
    boolean  SaveReputationDetailOne(ReputaTionInfo reputaTionInfo);
}
