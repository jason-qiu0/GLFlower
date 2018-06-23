package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import com.example.demo.utils.TestPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserInfoDao {
	    List<UserInfo> queryUserInfo(@Param("name") String name,@Param("phone") String phone );

    	/**
    	 * 根据Id列出具体区域
    	 *
    	 * @return area
    	 */
        Map<String,Object> queryUserInfoById(String phone);

    	/**
    	 * 插入区域信息
    	 *
    	 * @param
    	 * @return
    	 */
    	boolean insertUserInfo(UserInfo userInfo);
    	boolean deleteUserInfo(String phone);
	    List<UserInfo>   listUserInfoPage();
//
//    	/**
//    	 * 更新区域信息
//    	 *
//    	 * @param userInfo
//    	 * @return
//    	 */
//    	int updateUser(UserInfo userInfo);
//
//    	/**
//    	 * 删除区域信息
//    	 *
//    	 * @param userInfoId
//    	 * @return
//    	 */
//    	int deleteUserInfo(int userInfoId);
}
