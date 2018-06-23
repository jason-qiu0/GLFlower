package com.example.demo.web;

import com.example.demo.entity.BankInfo;
import com.example.demo.entity.ReputaTionInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.excel.ExcelUtil;
import com.example.demo.excel.entity.WebDto;
import com.example.demo.service.IBankInfoService;
import com.example.demo.service.IReputaTionInfoService;
import com.example.demo.service.IUserInfoService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.IUserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class UserInfoController {
	@Autowired
	private IUserInfoService userInfoService;
	@Autowired
	private IBankInfoService bankInfoService;
	@Autowired
		private IReputaTionInfoService iReputaTionInfoService;

	/**
	 * 获取所有的区域信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/listUserInfo", method = RequestMethod.GET)
	@CrossOrigin
	private Map<String, Object> listUserInfo(String name ,String phone) {
//	private Map<String, Object> listUserInfo() {
//		PageHelper.startPage(currentPage,pageSize);
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<UserInfo> list = new ArrayList<UserInfo>();
		// 获取区域列表
		List<UserInfo> map = userInfoService.getUserInfoList(name,phone);
		modelMap.put("userInfo",map);
//		modelMap.put("userInfo", new PageInfo(list));
		//		PageHelper.startPage(currentPage,pageSize);

		return modelMap;
	}

	/**
	 * 获取所有的区域信息
	 *
	 * @return
	 */
	@RequestMapping(value = "/listUserInfoPage", method = RequestMethod.GET)
	@CrossOrigin
	private Map<String, Object> listUserInfoPage(int currentPage   ,int  pageSize) {
		PageHelper.startPage(currentPage,pageSize);
		Map<String, Object> modelMap = new HashMap<String, Object>();
//		List<UserInfo> list = new ArrayList<UserInfo>();
		// 获取区域列表
		List<UserInfo> list = userInfoService.listUserInfoPage();
//		modelMap.put("userInfo",map);
		modelMap.put("userInfo", new PageInfo(list));


		return modelMap;
	}
	/**
	 * 通过区域Id获取区域信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/GetUserInfo", method = RequestMethod.GET)
    @CrossOrigin
	private Map<String, Object> getUserInfoByIdCard(String phone) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 获取区域信息
		Map map = userInfoService.queryUserInfoById(phone);
		modelMap.put("userInfo", map);
		return modelMap;
	}

	/**
	 * 添加区域信息
	 *
	 * @param userInfo
	 * @param
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 */
	@RequestMapping(value = "/SaveUserInfo", method = RequestMethod.POST)
	@CrossOrigin
	private Map<String, Object> SaveUserInfo(@RequestBody UserInfo userInfo)
			throws JsonParseException, JsonMappingException, IOException {
		Map map=userInfoService.queryUserInfoById(userInfo.getPhone());
		Map<String, Object> modelMap = new HashMap<String, Object>();
			userInfoService.deleteUserInfo(userInfo.getPhone());
			boolean flag=userInfoService.insertUserInfo(userInfo);
		if(flag) {
			        BankInfo bankInfo=new BankInfo();
					bankInfo.setBank(userInfo.getBank());
					bankInfo.setBankAccount(userInfo.getBankAccount());
					bankInfo.setIdCard(userInfo.getIdCard());
					bankInfo.setSubBank(userInfo.getSubBank());
					bankInfo.setPhone(userInfo.getPhone());
					//先判断当前手机号是否已经存在银行信息中
						bankInfoService.deleteBankinfo(userInfo.getPhone());

						boolean flagb=bankInfoService.SaveBankInfo(bankInfo) ;
						if(flagb){
							ReputaTionInfo reputaTionInfo=new ReputaTionInfo();
							reputaTionInfo.setPhone(userInfo.getPhone());
							reputaTionInfo.setChsiAccount(userInfo.getChsiAccount());
							modelMap.put("Success", iReputaTionInfoService.SaveReputationDetailOne(reputaTionInfo));
						}

		}else{
			modelMap.put("Success", false);
		}







		return modelMap;
	}


	@RequestMapping(value ="/ExportExcel", method = RequestMethod.GET)
	@CrossOrigin
	private Map<String, Object> ExportExcel()throws JsonParseException, JsonMappingException, IOException {
			Map<String, Object> modelMap = new HashMap<String, Object>();
		List<UserInfo> list = userInfoService.getUserInfoList(null,null);
	Map<String, String> map = new HashMap<String, String>();
      map.put("title", "网站信息表");
      map.put("total", list.size()+" 条");
        map.put("date", null);
		File file=new File("C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\template\\renxinghui.xlsx");
//		FileOutputStream  file=  new FileOutputStream("C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\template\\renxinghui.xlsx");
		FileOutputStream fileOutputStream=new FileOutputStream(file)  ;
     ExcelUtil.getInstance().exportObj2ExcelByTemplate(map, "web-info-template.xls",fileOutputStream ,
             list, UserInfo.class, true);
			// 添加区域信息
		     modelMap.put("Success",true);

		     modelMap.put("filePath",System.getProperty("user.dir"));
			return modelMap;
		}
//	/**
//	 * 修改区域信息，主要修改名字
//	 *
//	 * @param areaStr
//	 * @param request
//	 * @return
//	 * @throws IOException
//	 * @throws JsonMappingException
//	 * @throws JsonParseException
//	 */
//	@RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
//	private Map<String, Object> modifyArea(@RequestBody Area area)
//			throws JsonParseException, JsonMappingException, IOException {
//		Map<String, Object> modelMap = new HashMap<String, Object>();
//		// 修改区域信息
//		modelMap.put("success", areaService.modifyArea(area));
//		return modelMap;
//	}
//
//	@RequestMapping(value = "/removearea", method = RequestMethod.GET)
//	private Map<String, Object> removeArea(Integer areaId) {
//		Map<String, Object> modelMap = new HashMap<String, Object>();
//		// 修改区域信息
//		modelMap.put("success", areaService.deleteArea(areaId));
//		return modelMap;
//	}

}
