package com.example.demo.service.impl;

import com.example.demo.dao.PaymentDetailDao;
import com.example.demo.entity.PaymentDetail;
import com.example.demo.service.IPaymentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentDetailServiceImpl implements IPaymentDetailService {
    @Autowired
    private PaymentDetailDao paymentDetailDao;
    @Transactional
    @Override
    public boolean SavePackage(PaymentDetail paymentDetail) {
        return paymentDetailDao.SavePackage(paymentDetail);
    }

    @Override
    public List<PaymentDetail> GetPackageDetail(String phone) {

        return paymentDetailDao.GetPackageDetail(phone);
    }

    @Override
    public List<PaymentDetail> getPackageDetailList(String name,String phone) {

        return paymentDetailDao.getPackageDetailList(name,phone);
    }
    @Transactional
    @Override
    public boolean updatePackage(PaymentDetail paymentDetail) {
        return paymentDetailDao.updatePackage(paymentDetail);
    }
    @Transactional
    @Override
    public boolean deletePackage(PaymentDetail paymentDetail) {
        return paymentDetailDao.deletePackage(paymentDetail);
    }


}
