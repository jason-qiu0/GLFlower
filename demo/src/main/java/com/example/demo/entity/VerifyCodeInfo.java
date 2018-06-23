package com.example.demo.entity;

public class VerifyCodeInfo {
    private  String phone;
    private  String verifyCode;
    private String imeiVerifyCode;




    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    private  String idCard;

    public String getImeiVerifyCode() {
        return imeiVerifyCode;
    }

    public void setImeiVerifyCode(String imeiVerifyCode) {
        this.imeiVerifyCode = imeiVerifyCode;
    }
}
