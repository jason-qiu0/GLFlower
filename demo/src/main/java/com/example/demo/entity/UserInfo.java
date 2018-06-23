package com.example.demo.entity;

import com.example.demo.excel.ExcelResources;

import java.util.List;

public class UserInfo {
    private Integer Id;
    private String name;


    private String phone;
    private String idCard;
    private String school;
    private String schoolAddr;
    private String education;
    private String qq;
    private String webchat;
     private String   bank;
     private String bankAccount;
     private String subBank;
     private  String state;
     private String ApplyTime;


    private  String  contactName1;
     private String contactPhone1;
     private String relation1;
     private String contactName2;
     private String contactPhone2;
     private  String relation2;

    public String getChsiAccount() {
        return chsiAccount;
    }

    public void setChsiAccount(String chsiAccount) {
        this.chsiAccount = chsiAccount;
    }

    private String chsiAccount;

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

    public String getRelation1() {
        return relation1;
    }

    public void setRelation1(String relation1) {
        this.relation1 = relation1;
    }
    @ExcelResources(title="联系人2",order=8)
    public String getContactName2() {
        return contactName2;
    }

    public void setContactName2(String contactName2) {
        this.contactName2 = contactName2;
    }
    @ExcelResources(title="联系人2电话",order=9)
    public String getContactPhone2() {
        return contactPhone2;
    }

    public void setContactPhone2(String contactPhone2) {
        this.contactPhone2 = contactPhone2;
    }






    public String getRelation2() {
        return relation2;
    }

    public void setRelation2(String relation2) {
        this.relation2 = relation2;
    }

    private List<BankInfo> bankInfo;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
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
    @ExcelResources(title="身份证号码",order=5)
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    @ExcelResources(title="学校地址",order=10)
    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    @ExcelResources(title="QQ",order=4)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
    @ExcelResources(title="微信",order=3)
    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat;
    }




    @ExcelResources(title="银行",order=12)
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    @ExcelResources(title="银行账号",order=11)
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getSubBank() {
        return subBank;
    }

    public void setSubBank(String subBank) {
        this.subBank = subBank;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getApplyTime() {
        return ApplyTime;
    }

    public void setApplyTime(String applyTime) {
        ApplyTime = applyTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", schoolAddr='" + schoolAddr + '\'' +
                ", qq='" + qq + '\'' +
                ", webChat='" + webchat + '\'' +
                ", bank='" + bank + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", contactName1='" + contactName1 + '\'' +
                ", contactPhone1='" + contactPhone1 + '\'' +
                ", contactName2='" + contactName2 + '\'' +
                ", contactPhone2='" + contactPhone2 + '\'' +
                '}';
    }

    public UserInfo( ) {

    }

    public UserInfo(String name, String phone, String idCard, String schoolAddr,
                    String qq, String webChat, String bank, String bankAccount,
                    String contactName1, String contactPhone1, String contactName2,
                    String contactPhone2) {

        this.name = name;
        this.phone = phone;
        this.idCard = idCard;
        this.schoolAddr = schoolAddr;
        this.qq = qq;
        this.webchat = webchat;
        this.bank = bank;
        this.bankAccount = bankAccount;
        this.contactName1 = contactName1;
        this.contactPhone1 = contactPhone1;
        this.contactName2 = contactName2;
        this.contactPhone2 = contactPhone2;
    }

//    public UserInfo(Integer id, String name, String phone, String idCard, String school, String schoolAddr, String education, String qq, String webChat, String bank, String bankAccount, String subBank, String state, String applyTime, String contactName1, String contactPhone1, String relation1, String contactName2, String getContactPhone2, String relation2, List<BankInfo> bankInfo) {
//        Id = id;
//        this.name = name;
//        this.phone = phone;
//        this.idCard = idCard;
//        this.school = school;
//        this.schoolAddr = schoolAddr;
//        this.education = education;
//        this.qq = qq;
//        this.webChat = webChat;
//        this.bank = bank;
//        this.bankAccount = bankAccount;
//        this.subBank = subBank;
//        this.state = state;
//        ApplyTime = applyTime;
//        this.contactName1 = contactName1;
//        this.contactPhone1 = contactPhone1;
//        this.relation1 = relation1;
//        this.contactName2 = contactName2;
//        this.getContactPhone2 = getContactPhone2;
//        this.relation2 = relation2;
//        this.bankInfo = bankInfo;
//    }

    public List<BankInfo> getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(List<BankInfo> bankInfo) {
        this.bankInfo = bankInfo;
    }
}
