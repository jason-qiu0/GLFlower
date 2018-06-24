package com.example.demo.web;

import com.example.demo.entity.UserReputationBase;
import com.example.demo.service.IUserReputationBaseService;
import com.example.demo.utils.PublicMacroDefinition;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/userReputationBaseInfo")
public class UserReputationBaseControler {
    @Autowired
    private IUserReputationBaseService iUserReputationBaseService;

    @RequestMapping(value = "/SaveReputationDetail", method = RequestMethod.POST)
    private Map<String, Object> saveReputation(@RequestBody UserReputationBase info)
            throws JsonParseException, JsonMappingException, IOException {

        String result = "";
        String message = "";
        Map<String, Object> modelMap = new HashMap<String, Object>();

        UserReputationBase infoTemp = iUserReputationBaseService.getUserReputationInfo(info.getPhone());
        if(null == infoTemp)
        {
            if(iUserReputationBaseService.saveUserReputationInfo(info)){
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_SUCCESS;
            }else {
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_FAIL;
            }
        }else {
            result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
            message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_FAIL;
        }

        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_SUCCESS, result);
        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_MESSAGE, message);
        return  modelMap;
    }

    @RequestMapping(value = "/findReputationDetail", method = RequestMethod.GET)
    private Map<String, Object> getReputation(String phone)
            throws JsonParseException, JsonMappingException, IOException {
        String result = "";
        Object message = null;
        Map<String, Object> modelMap = new HashMap<String, Object>();

        UserReputationBase infoTemp = iUserReputationBaseService.getUserReputationInfo(phone);
        if(null == infoTemp)
        {
            result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
            message = null;
        }else {
            result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
            message = infoTemp;
        }

        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_SUCCESS, result);
        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_MESSAGE, message);
        return  modelMap;
    }
}
