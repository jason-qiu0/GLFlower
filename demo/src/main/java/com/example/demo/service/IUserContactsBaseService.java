package com.example.demo.service;

import com.example.demo.entity.UserContactsBase;

public interface IUserContactsBaseService {
    public boolean saveUserContactsBase(UserContactsBase info);

    public UserContactsBase getUserContactsBase(String phone);

    public  boolean updateUserContactsBase(UserContactsBase info);

    public  boolean deleteUserContactsBase(String phone);
}
