package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import com.example.demo.utils.TestPage;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface IUserInfoService {

	/**
	 * 获取区域列表
	 * 
	 * @return
	 */
	List<UserInfo> getUserInfoList(String name,String phone);

	/**
	 * 通过区域Id获取区域信息
	 * 
	 * @param phone
	 * @return
	 */
	Map<String,Object> queryUserInfoById(String phone);

	/**
	 * 增加区域信息
	 * 
	 * @param userInfo
	 * @return
	 */
	boolean insertUserInfo(UserInfo userInfo);
	boolean deleteUserInfo(String phone);
	List<UserInfo>  listUserInfoPage();
//
//	/**
//	 * 修改区域信息
//	 *
//	 * @param userInfo
//	 * @return
//	 */
//	boolean modifyUserInfo(UserInfo userInfo);
//
//	/**
//	 * 删除区域信息
//	 *
//	 * @param Id
//	 * @return
//	 */
//	boolean deleteUserInfo(int Id);

}
