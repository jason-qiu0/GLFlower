package com.example.demo.web;

import com.example.demo.entity.UserContactsBase;
import com.example.demo.service.IUserContactsBaseService;
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
@RequestMapping("/userContactsBaseInfo")
public class UserContactsBaseControler {
    @Autowired
    private IUserContactsBaseService iUserContactsBaseService;

    @RequestMapping(value = "/SaveUserContacts", method = RequestMethod.POST)
    private Map<String, Object> saveUserContacts(@RequestBody UserContactsBase info)
            throws JsonParseException, JsonMappingException, IOException {

        String result = "";
        String message = "";
        Map<String, Object> modelMap = new HashMap<String, Object>();

        UserContactsBase infoTemp = iUserContactsBaseService.getUserContactsBase(info.getPhone());
        if(null == infoTemp)
        {
            if(iUserContactsBaseService.saveUserContactsBase(info)){
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_SUCCESS;
            }else {
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_FAIL;
            }
        }
        else
        {
            if(iUserContactsBaseService.saveUserContactsBase(info)) {
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

    @RequestMapping(value = "/GetUserContacts", method = RequestMethod.GET)
    private Map<String, Object> getUserContacts(String phone)
            throws JsonParseException, JsonMappingException, IOException {

        String result = "";
        String message = "";
        Map<String, Object> modelMap = new HashMap<String, Object>();
        UserContactsBase infoTemp = iUserContactsBaseService.getUserContactsBase(phone);

        if(null == infoTemp){
            result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
        }else {
            result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
        }
        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_SUCCESS, result);
        modelMap.put(PublicMacroDefinition.RESPONSE_KEY_MESSAGE, infoTemp);

        return modelMap;
    }
}
