package com.example.demo.dao;

import com.example.demo.entity.UserReputationBase;

public interface UserReputationDao {
    public boolean saveUserReputationBase(UserReputationBase info);

    public UserReputationBase getUserReputationBase(String phone);

    public boolean updateUserReputationBase(UserReputationBase info);

    public boolean deleteUserReputationBase(String phone);
}
