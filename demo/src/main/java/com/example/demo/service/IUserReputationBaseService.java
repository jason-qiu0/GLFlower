package com.example.demo.service;

import com.example.demo.entity.UserReputationBase;

public interface IUserReputationBaseService {
    public boolean saveUserReputationInfo(UserReputationBase info);

    public UserReputationBase getUserReputationInfo(String phone);

    public  boolean updateUserReputationInfo(UserReputationBase info);

    public  boolean deleteUserReputationInfo(String phone);
}
