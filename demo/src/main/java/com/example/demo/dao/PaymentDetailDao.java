package com.example.demo.dao;

import com.example.demo.entity.PaymentDetail;
import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentDetailDao {
    public boolean SavePackage(PaymentDetail paymentDetail);
    public List<PaymentDetail> GetPackageDetail(String phone);
     List<PaymentDetail>  getPackageDetailList(@Param("name") String name,@Param("phone") String phone);
    public boolean updatePackage(PaymentDetail  paymentDetail);
    public boolean deletePackage(PaymentDetail paymentDetail)   ;

}
