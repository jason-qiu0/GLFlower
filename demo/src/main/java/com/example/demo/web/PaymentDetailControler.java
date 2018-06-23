package com.example.demo.web;

import com.example.demo.entity.PaymentDetail;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.IPaymentDetailService;
import com.example.demo.utils.DateFormUtil;
import com.example.demo.utils.JuheDemo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/paymentDetail")
public class PaymentDetailControler {
    @Autowired
    private IPaymentDetailService iPaymentDetailDaoService;

    @RequestMapping(value = "/SavePackage", method = RequestMethod.POST)
   	@CrossOrigin
   	private Map<String, Object> SavePackage(@RequestBody PaymentDetail paymentDetail) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
                Integer serviceCharge=Integer.valueOf(paymentDetail.getServiceCharge());
                  if(serviceCharge>0||serviceCharge==0){
                      paymentDetail.setApplyTime(DateFormUtil.getFormatDate());
                      paymentDetail.setState("0");
                      boolean  flag= iPaymentDetailDaoService.SavePackage(paymentDetail);
                                     if(flag){
                                         modelMap.put("Success",true);
                                         modelMap.put("Msg","申请成功");
                                     }else{
                                         modelMap.put("Success",false);
                                         modelMap.put("Msg","申请失败");
                                     }
                  } else{
                      modelMap.put("Success",false);
                      modelMap.put("Msg","服务费不能小于0");
                  }

                return     modelMap;
    }

       @RequestMapping(value = "/GetPackageDetail", method = RequestMethod.GET)
    	@CrossOrigin
    	private Map<String, Object> GetPackageDetail(String phone) {
         Map<String, Object> modelMap = new HashMap<String, Object>();
           List<PaymentDetail>  paymentDetail= iPaymentDetailDaoService.GetPackageDetail(phone);
           modelMap.put("paymentDetail",paymentDetail);
            return     modelMap;
     }

    @RequestMapping(value = "/GetPackageDetailList", method = RequestMethod.GET)
  	@CrossOrigin
  	private Map<String, Object> GetPackageDetailList(int currentPage, int pageSize,String name,String phone) {
        PageHelper.startPage(currentPage,pageSize);

       Map<String, Object> modelMap = new HashMap<String, Object>();
        List<PaymentDetail> paymentDetailList= iPaymentDetailDaoService.getPackageDetailList(name,phone);
        modelMap.put("paymentDetailList",new PageInfo(paymentDetailList) );
//        modelMap.put("paymentDetailList",paymentDetailList );

          return     modelMap;
   }

    @RequestMapping(value = "/updatePackage", method = RequestMethod.POST)
  	@CrossOrigin
  	private Map<String, Object> updatePackage(@RequestBody PaymentDetail paymentDetail) {
        Map<String, Object> modelMap = new HashMap<String, Object>()  ;
         paymentDetail.setLendingTime(DateFormUtil.getFormatDate());
         paymentDetail.setState(paymentDetail.getState());
         modelMap.put("Success",iPaymentDetailDaoService.updatePackage(paymentDetail)) ;
        return     modelMap;
   }

    @RequestMapping(value = "/deletePackage", method = RequestMethod.POST)
    @CrossOrigin
    private Map<String, Object> deletePackage(@RequestBody PaymentDetail paymentDetail) {
           Map<String, Object> modelMap = new HashMap<String, Object>()  ;
            modelMap.put("Success",iPaymentDetailDaoService.deletePackage(paymentDetail)) ;
            return     modelMap;
      }




}
