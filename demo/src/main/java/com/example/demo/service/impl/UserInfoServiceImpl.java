package com.example.demo.service.impl;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.IUserInfoService;
import com.example.demo.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements IUserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> getUserInfoList(String name,String phone) {
		// 返回所有的区域信息
		return userInfoDao.queryUserInfo(name,phone);
	}

	@Override
	public Map<String,Object> queryUserInfoById(String phone)
	{

	    return userInfoDao.queryUserInfoById(phone);
	}

	@Transactional
	@Override
	public boolean insertUserInfo(UserInfo userInfo) {
		       return userInfoDao.insertUserInfo(userInfo);
	}
	@Transactional
	@Override
	public boolean deleteUserInfo(String phone) {
		return userInfoDao.deleteUserInfo(phone);
	}

	@Override
	public List<UserInfo> listUserInfoPage() {
		return userInfoDao.listUserInfoPage();
	}

//	@Transactional
//	@Override
//	public boolean modifyArea(Area area) {
//		// 空值判断，主要是areaId不为空
//		if (area.getAreaId() != null && area.getAreaId() > 0) {
//			// 设置默认值
//			area.setLastEditTime(new Date());
//			try {
//				// 更新区域信息
//				int effectedNum = areaDao.updateArea(area);
//				if (effectedNum > 0) {
//					return true;
//				} else {
//					throw new RuntimeException("更新区域信息失败!");
//				}
//			} catch (Exception e) {
//				throw new RuntimeException("更新区域信息失败:" + e.toString());
//			}
//		} else {
//			throw new RuntimeException("区域信息不能为空！");
//		}
//	}
//
//	@Transactional
//	@Override
//	public boolean deleteArea(int areaId) {
//		if (areaId > 0) {
//			try {
//				// 删除区域信息
//				int effectedNum = areaDao.deleteArea(areaId);
//				if (effectedNum > 0) {
//					return true;
//				} else {
//					throw new RuntimeException("删除区域信息失败!");
//				}
//			} catch (Exception e) {
//				throw new RuntimeException("删除区域信息失败:" + e.toString());
//			}
//		} else {
//			throw new RuntimeException("区域Id不能为空！");
//		}
//	}
}
