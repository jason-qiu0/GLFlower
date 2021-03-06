package com.example.demo.web;

import com.example.demo.entity.UserBaseInfo;
import com.example.demo.service.IUserInfoBaseService;
import com.example.demo.utils.PublicMacroDefinition;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userBaseInfo")
public class UserBaseInfoController {
    @Autowired
    private IUserInfoBaseService iUserInfoBaseService;

    @RequestMapping(value = "/SaveOrUpdateUserInfo", method = RequestMethod.POST)
    private Map<String, Object> saveUserBaseInfo(@RequestBody UserBaseInfo userInfo)
            throws JsonParseException, JsonMappingException, IOException {

        String result = "";
        String message = "";
        Map<String, Object> modelMap = new HashMap<String, Object>();
        UserBaseInfo infoTemp = iUserInfoBaseService.getUserBaseInfo(userInfo.getPhone());
        if(null == infoTemp){
            if(iUserInfoBaseService.saveUserBaseInfo(userInfo)){
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_SUCCESS;
            } else{
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_FAIL;
            }
        } else{
            if(iUserInfoBaseService.updateUserBaseInfo(userInfo)){
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_UPDATE_SUCCESS;
            }else{
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_UPDATE_FAIL;
            }
        }

        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_SUCCESS, result);
        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_MESSAGE, message);
        return modelMap;
    }
}
