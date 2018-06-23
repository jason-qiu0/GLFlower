package com.example.demo.web;

import com.example.demo.entity.ReputaTionInfo;
import com.example.demo.service.IReputaTionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ReputationDetail")
public class ReputaTionDailInfoControler {
    @Autowired
    private IReputaTionInfoService iReputaTionDailInfoService;
    @RequestMapping(value = "/SaveReputationDetail", method = RequestMethod.POST)
    @CrossOrigin
    private Map<String,Object> SaveReputationDetail(@RequestBody ReputaTionInfo reputaTionInfo) {
//        ReputaTionInfo reputaTionInfo1=  iReputaTionDailInfoService.GetReputationDetail(reputaTionInfo.getPhone());
        Map<String, Object> modelMap = new HashMap<String,Object>();
//         if(reputaTionInfo1!=null){
//             iReputaTionDailInfoService.deleteReputationDetail(reputaTionInfo.getPhone());
//         }
             reputaTionInfo.setFlag("1");
             boolean  flag= iReputaTionDailInfoService.SaveReputationDetail(reputaTionInfo);
             modelMap.put("Success",flag);

          return   modelMap;
      }
    @RequestMapping(value = "/GetReputationDetail", method = RequestMethod.GET)
    @CrossOrigin
     private Map<String, Object> GetReputationDetail  (String phone) {
          Map<String, Object> modelMap = new HashMap<String, Object>();
          ReputaTionInfo   reputaTionInfo= iReputaTionDailInfoService.GetReputationDetail(phone);
           modelMap.put("ReputaTionDailInfo",reputaTionInfo);
           return     modelMap;
      }

}
