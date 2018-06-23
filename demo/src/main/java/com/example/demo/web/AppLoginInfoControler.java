package com.example.demo.web;

import com.example.demo.entity.AppLoginInfo;
import com.example.demo.entity.VerifyCodeInfo;
import com.example.demo.service.IAppLoginInfoService;
import com.example.demo.service.IVerifyCodeService;
import com.example.demo.utils.DateFormUtil;
import com.example.demo.utils.JuheDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apploginInfo")
public class AppLoginInfoControler {
    @Autowired
    private IAppLoginInfoService iAppLoginInfoService;
    @Autowired
    private IVerifyCodeService iVerifyCodeService;
    @RequestMapping(value = "/GetVerifyCode", method = RequestMethod.POST)
        	@CrossOrigin
        	private Map<String, Object> GetVerifyCode(@RequestBody AppLoginInfo appLoginInfo) {
             Map<String, Object> modelMap = new HashMap<String, Object>();
             iVerifyCodeService.deleteVenifyCode(appLoginInfo.getPhone());
             String appVeifyCode= JuheDemo.getRequest2(appLoginInfo);
             iVerifyCodeService.deleteVenifyCode(appLoginInfo.getPhone());
             VerifyCodeInfo venifyCodeInfo  =new VerifyCodeInfo();
             venifyCodeInfo.setPhone(appLoginInfo.getPhone());
             venifyCodeInfo.setVerifyCode(appVeifyCode);
             String date= DateFormUtil.getSysdate();
             venifyCodeInfo.setImeiVerifyCode(date);;
             boolean flag=  iVerifyCodeService.insertVenifyCode(venifyCodeInfo) ;
             modelMap.put("Success",flag);
             return   modelMap;
         }
         
       @RequestMapping(value = "/Register", method = RequestMethod.POST)
      	@CrossOrigin
      	private Map<String, Object> Register(@RequestBody AppLoginInfo appLoginInfo) {
           int count=  iAppLoginInfoService.ValidateIdCard(appLoginInfo)    ;
           Map<String, Object> modelMap = new HashMap<String, Object>();
           if(count==0){
               String verifyCode=  appLoginInfo.getVerifyCode();
                VerifyCodeInfo venifyCodeInfo=iVerifyCodeService.selectVerifyCode(appLoginInfo.getPhone()) ;
                String appVeifyCode= venifyCodeInfo.getVerifyCode();
           if(verifyCode.equals(appVeifyCode)) {
//               if(1==1){
              boolean  flag= iAppLoginInfoService.Register(appLoginInfo);
               modelMap.put("Success",flag);
              if(flag){
                  modelMap.put("errMsg","注册成功");
                  iVerifyCodeService.deleteVenifyCode(appLoginInfo.getPhone());
              } else{
                  modelMap.put("errMsg","用户名或密码错误");
              }
           } else {
               modelMap.put("Success",false);
               modelMap.put("errMsg","验证码错误");
           }
           }else{
               modelMap.put("Success",false);
               modelMap.put("errMsg","手机号码已经被注册");
           }
           return     modelMap;
       }
    @RequestMapping(value = "/RestUserPwd", method = RequestMethod.POST)
        	@CrossOrigin
        	private Map<String, Object> RestUserPwd(@RequestBody AppLoginInfo appLoginInfo) {
             Map<String, Object> modelMap = new HashMap<String, Object>();
             String verifyCode=  appLoginInfo.getVerifyCode();
              VerifyCodeInfo venifyCodeInfo=iVerifyCodeService.selectVerifyCode(appLoginInfo.getPhone()) ;
              if(verifyCode.equals(venifyCodeInfo.getVerifyCode())){
                  boolean  flag= iAppLoginInfoService.RestUserPwd(appLoginInfo);
                  modelMap.put("Success",true);
                  modelMap.put("errMsg","密码重置成功");
                  iVerifyCodeService.deleteVenifyCode(appLoginInfo.getPhone());
              } else{
                  modelMap.put("Success",false);
                  modelMap.put("errMsg","验证码不正确");
              }
             return     modelMap;
         }
       @RequestMapping(value = "/APPLogin", method = RequestMethod.POST)
        	@CrossOrigin
        	private Map<String, Object> APPLogin(@RequestBody AppLoginInfo appLoginInfo) {
             Map<String, Object> modelMap = new HashMap<String, Object>();
             String verifyCode= appLoginInfo.getVerifyCode();
//              VerifyCodeInfo venifyCodeInfo=iVerifyCodeService.selectVeifryCode(appLoginInfo.getPhone()) ;
//              if(verifyCode.equals(venifyCodeInfo.getVerifyCode())){
                  int  count= iAppLoginInfoService.AppLogin(appLoginInfo);
                  if(count==0){
                      modelMap.put("Success",false);
                      modelMap.put("errMsg","用户名或密码错误");
                  }else{
                      modelMap.put("Success",true);
                      modelMap.put("errMsg","登录成功");
                  }

//              }else{
//                  modelMap.put("Success",false);
//                  modelMap.put("errMsg","验证码错误");
//              }

             return     modelMap;
         }
}
