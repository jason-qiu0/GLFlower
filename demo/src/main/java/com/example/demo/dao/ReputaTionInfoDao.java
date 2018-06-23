package com.example.demo.dao;

import com.example.demo.entity.ReputaTionInfo;
import org.apache.ibatis.annotations.Param;

public interface ReputaTionInfoDao {
    public boolean SaveReputationDetail(ReputaTionInfo reputaTionInfo);
    public ReputaTionInfo GetReputationDetail (@Param("phone") String phone);
     boolean deleteReputationDetail(String phone);
     public  boolean SaveReputationDetailOne(ReputaTionInfo reputaTionInfo);
}
