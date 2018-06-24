package com.example.demo.web;

import com.example.demo.entity.BankBaseInfo;
import com.example.demo.service.IBankBaseInfoService;
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
@RequestMapping("/userBankBaseInfo")
public class BankBaseInfoController {
    @Autowired
    private IBankBaseInfoService iBankBaseInfoService;

    @RequestMapping(value = "/SaveOrUpdateBankInfo", method = RequestMethod.POST)
    private Map<String, Object> saveOrUpdateBankInfo(@RequestBody BankBaseInfo bankInfo)
            throws JsonParseException, JsonMappingException, IOException {

        String result = "";
        String message = "";
        Map<String, Object> modelMap = new HashMap<String, Object>();

        BankBaseInfo infoTemp = iBankBaseInfoService.getBankInfo(bankInfo.getPhone());
        if(null == infoTemp) {
            if(iBankBaseInfoService.saveBankInfo(bankInfo)){
                result = PublicMacroDefinition.RESPONSE_FLAGE_SUCCESS;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_SUCCESS;
            }else{
                result = PublicMacroDefinition.RESPONSE_FLAGE_FAIL;
                message = PublicMacroDefinition.RESPONSE_MESSAGE_SAVE_FAIL;
            }
        }else{
            if(iBankBaseInfoService.updateBankInfo(bankInfo)){
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
