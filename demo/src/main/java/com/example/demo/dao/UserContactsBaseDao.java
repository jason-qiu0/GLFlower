package com.example.demo.dao;

import com.example.demo.entity.UserContactsBase;

public interface UserContactsBaseDao {
    public boolean saveUserContactsBase(UserContactsBase info);

    public UserContactsBase getUserContactsBase(String phone);

    public boolean updateUserContactsBase(UserContactsBase info);

    public boolean deleteUserContactsBase(String phone);
}
