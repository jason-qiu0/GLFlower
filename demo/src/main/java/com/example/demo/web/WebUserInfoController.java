package com.example.demo.web;

import com.example.demo.entity.UserInfo;
import com.example.demo.entity.WebUserInfo;
import com.example.demo.service.IWebUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/web")
public class WebUserInfoController {
    @Autowired
    private IWebUserInfoService iWebUserInfoService;
    /**
    	 * 获取所有的区域信息
    	 *
    	 * @return
    	 */
    	@RequestMapping(value = "/login", method = RequestMethod.POST)
        @CrossOrigin
    	private Map<String, Object> webLogin(@RequestBody WebUserInfo webUserInfo) {
    		Map<String, Object> modelMap = new HashMap<String, Object>();
    		// 获取区域列表
    		int count = iWebUserInfoService.webLogin(webUserInfo);
    		if(count==1){
                modelMap.put("success", "true");
                modelMap.put("errMsg","登录成功");
            }else{
                modelMap.put("success", "false");
                modelMap.put("errMsg","登录失败，请检查用户名或密码");
            }

    		return modelMap;
    	}

    @RequestMapping(value ="/updateMangerInfo", method = RequestMethod.POST)
    @CrossOrigin
    private Map<String, Object> updateMangerInfo(@RequestBody WebUserInfo webUserInfo) {
       		Map<String, Object> modelMap = new HashMap<String, Object>();
       		// 获取区域列表
       		boolean flag = iWebUserInfoService.updateMangerInfo(webUserInfo);
       		if(flag){
                   modelMap.put("Success", true);
                   modelMap.put("errMsg","更新密码成功");
               }else{
                   modelMap.put("Success", false);
                   modelMap.put("errMsg","更新密码失败，旧密码错误");
               }

       		return modelMap;
       	}
}
