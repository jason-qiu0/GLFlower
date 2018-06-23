package com.example.demo.web;

import com.example.demo.entity.UserBaseInfo;
import com.example.demo.service.IUserInfoBaseService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userBaseInfoController")
public class UserBaseInfoController {
    @Autowired
    private IUserInfoBaseService iUserInfoBaseService;

    @RequestMapping(value = "/SaveUserBaseInfo", method = RequestMethod.POST)
    private Map<String, Object> SaveUserBaseInfo(@RequestBody UserBaseInfo userInfo)
            throws JsonParseException, JsonMappingException, IOException {

        UserBaseInfo userinfo = iUserInfoBaseService.getUserBaseInfoByPhone(userInfo.getPhone());
        boolean result = false;
        if(null == userinfo)
        {
            result = iUserInfoBaseService.addUserRecord(userInfo);
        }
        else
        {
            result = iUserInfoBaseService.updateUserRecord(userInfo);
        }

        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("Success", result);
        return modelMap;
    }
}
