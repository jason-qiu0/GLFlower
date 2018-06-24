package com.example.demo.web;

import com.example.demo.entity.UserCompanyInfo;
import com.example.demo.service.IUserCompanyInfoService;
import com.example.demo.utils.PublicMacroDefinition;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/userCompanyBaseInfo")
public class UserCompanyInfoControler {
    @Autowired
    private  IUserCompanyInfoService iUserCompanyInfoService;

    @RequestMapping(value = "/SaveOrUpdateCompanyInfo", method = RequestMethod.POST)
    private Map<String, Object> saveOrUpdateCompanyInfo(@RequestBody UserCompanyInfo info)
            throws JsonParseException, JsonMappingException, IOException {

        String result = "";
        String message = "";
        Map<String, Object> modelMap = new HashMap<String, Object>();

        UserCompanyInfo infoTemp = iUserCompanyInfoService.getUserCompanyInfo(info.getPhone());
        if(null == infoTemp)
        {
            if(iUserCompanyInfoService.saveUserCompanyInfo(info)){
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_SUCCESS;
            }else {
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_FAIL;
            }
        }
        else
        {
            if(iUserCompanyInfoService.updateUserCompanyInfo(info)) {
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_UPDATE_SUCCESS;
            }else{
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_UPDATE_FAIL;
            }
        }

        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_SUCCESS, result);
        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_MESSAGE, message);
        return  modelMap;
    }
}
