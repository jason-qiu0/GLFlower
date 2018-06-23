package com.example.demo.service;

import com.example.demo.entity.PaymentDetail;

import java.util.List;

public interface IPaymentDetailService {
    public  boolean SavePackage(PaymentDetail paymentDetail);
    public  List<PaymentDetail> GetPackageDetail(String phone);
    public List<PaymentDetail> getPackageDetailList(String name,String phone);
    public boolean updatePackage(PaymentDetail paymentDetail);
    public boolean deletePackage(PaymentDetail paymentDetail )   ;
}
