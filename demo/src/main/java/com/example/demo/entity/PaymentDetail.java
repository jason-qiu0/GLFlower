package com.example.demo.entity;

import java.util.Date;

public class PaymentDetail {
    private  String phone;
    private String IdCard;
    private String packages;
    private String period;
    private String serviceCharge;
     private String state;
     private String overdueFine ;
     private String applyTime;
     private  String lendingTime;
     private  String lastRepaymentTime;
     private  String realRepaymentTime;
     private String repaymentRemark;
      private String repaymentBank;
      private String name;
      private String qq;
      private String bankAccount;
      private String bank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getSubBank() {
        return subBank;
    }

    public void setSubBank(String subBank) {
        this.subBank = subBank;
    }

    private String subBank;
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOverdueFine() {
        return overdueFine;
    }

    public void setOverdueFine(String overdueFine) {
        this.overdueFine = overdueFine;
    }


    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getLendingTime() {
        return lendingTime;
    }

    public void setLendingTime(String lendingTime) {
        this.lendingTime = lendingTime;
    }

    public String getLastRepaymentTime() {
        return lastRepaymentTime;
    }

    public void setLastRepaymentTime(String lastRepaymentTime) {
        this.lastRepaymentTime = lastRepaymentTime;
    }

    public String getRealRepaymentTime() {
        return realRepaymentTime;
    }

    public void setRealRepaymentTime(String realRepaymentTime) {
        this.realRepaymentTime = realRepaymentTime;
    }

    public String getRepaymentRemark() {
        return repaymentRemark;
    }

    public void setRepaymentRemark(String repaymentRemark) {
        this.repaymentRemark = repaymentRemark;
    }



    public PaymentDetail() {
    }

    public String getRepaymentBank() {
        return repaymentBank;
    }

    public void setRepaymentBank(String repaymentBank) {
        this.repaymentBank = repaymentBank;
    }
}
