package com.example.demo.dao;

import com.example.demo.entity.UserContacts;
import org.apache.ibatis.annotations.Param;

import javax.smartcardio.Card;

public interface UserContactsDao {
    boolean insertUserContacts(UserContacts userContacts) ;
    boolean updateUserContacts(UserContacts userContacts);
    UserContacts GetContacts(@Param("phone") String  phone);
    public Integer selectUserContacts(String phone);

}
