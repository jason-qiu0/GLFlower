package com.example.demo.service;

import com.example.demo.entity.UserContacts;

public interface IUserContactsService {
    boolean insertUserContacts(UserContacts userContacts);
    boolean updateUserContacts(UserContacts userContacts);
    UserContacts GetContacts(String phone);
    public Integer selectUserContacts(String phone);

}
