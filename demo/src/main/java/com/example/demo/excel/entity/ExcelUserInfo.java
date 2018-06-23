package com.example.demo.excel.entity;

import com.example.demo.excel.ExcelResources;

public class ExcelUserInfo {
    private  String name;
    private String phone;
    private String webchat;

    public ExcelUserInfo() {

    }

    private String   qq;
    private String idCard;
    private String  contactName1 ;
    private String contactPhone1;
    private String getContactName2;
    private String getContactPhone2;
    private String schoolAddr;
    @ExcelResources(title="银行账号",order=11)
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    @ExcelResources(title="银行",order=12)
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    private String bankAccount;
    private String bank;
    @ExcelResources(title="姓名",order=1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ExcelResources(title="电话",order=2)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @ExcelResources(title="微信",order=3)
    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat;
    }



    @ExcelResources(title="QQ",order=4)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
    @ExcelResources(title="身份证号码",order=5)
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    @ExcelResources(title="联系人1",order=6)
    public String getContactName1() {
        return contactName1;
    }

    public void setContactName1(String contactName1) {
        this.contactName1 = contactName1;
    }

    @ExcelResources(title="联系人1电话",order=7)
    public String getContactPhone1() {
        return contactPhone1;
    }

    public void setContactPhone1(String contactPhone1) {
        this.contactPhone1 = contactPhone1;
    }
    @ExcelResources(title="联系人2",order=8)
    public String getGetContactName2() {
        return getContactName2;
    }

    public void setGetContactName2(String getContactName2) {
        this.getContactName2 = getContactName2;
    }
    @ExcelResources(title="联系人2电话",order=9)
    public String getGetContactPhone2() {
        return getContactPhone2;
    }

    public void setGetContactPhone2(String getContactPhone2) {
        this.getContactPhone2 = getContactPhone2;
    }
    @ExcelResources(title="学校地址",order=10)
    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    public ExcelUserInfo(String name, String phone, String webChat, String qq, String idCard, String contactName1, String contactPhone1, String getContactName2, String getContactPhone2, String schoolAddr, String bankAccount, String bank) {
        this.name = name;
        this.phone = phone;
        this.webchat = webChat;
        this.qq = qq;
        this.idCard = idCard;
        this.contactName1 = contactName1;
        this.contactPhone1 = contactPhone1;
        this.getContactName2 = getContactName2;
        this.getContactPhone2 = getContactPhone2;
        this.schoolAddr = schoolAddr;
        this.bankAccount = bankAccount;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "ExcelUserInfo{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", webChat='" + webchat + '\'' +
                ", qq='" + qq + '\'' +
                ", idCard='" + idCard + '\'' +
                ", contactName1='" + contactName1 + '\'' +
                ", contactPhone1='" + contactPhone1 + '\'' +
                ", getContactName2='" + getContactName2 + '\'' +
                ", getContactPhone2='" + getContactPhone2 + '\'' +
                ", schoolAddr='" + schoolAddr + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
