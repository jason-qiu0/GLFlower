package com.example.demo.web;

import com.example.demo.entity.PaymentDetail;
import com.example.demo.entity.UserContacts;
import com.example.demo.service.IPaymentDetailService;
import com.example.demo.service.IUserContactsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/contacts")
public class UserContactsControler {
    @Autowired
      private IUserContactsService iUserContactsService;

      @RequestMapping(value = "/SaveContacts", method = RequestMethod.POST)
     	@CrossOrigin
     	private Map<String, Object> SaveContacts(@RequestBody UserContacts userContacts) {
          Map<String, Object> modelMap = new HashMap<String, Object>();
          Integer count=  iUserContactsService.selectUserContacts(userContacts.getPhone());
          if(count==0){
              modelMap.put("Success", iUserContactsService.insertUserContacts(userContacts));
          } else{
              modelMap.put("Success", iUserContactsService.updateUserContacts(userContacts));
          }

          return  modelMap;

      }

            @RequestMapping(value = "/GetContacts", method = RequestMethod.GET)
         	@CrossOrigin
         	 private Map<String, Object> GetContacts( String phone) {
              Map<String, Object> modelMap = new HashMap<String, Object>();
              UserContacts userContacts= iUserContactsService.GetContacts(phone);
                modelMap.put("userContacts",userContacts);
              return  modelMap;

          }
}
