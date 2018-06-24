package com.example.demo.entity;

public class UserCompanyInfo {
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyLeaderPhone() {
        return companyLeaderPhone;
    }

    public void setCompanyLeaderPhone(String companyLeaderPhone) {
        this.companyLeaderPhone = companyLeaderPhone;
    }

    private String phone;
    private String companyName;
    private String companyAddress;
    private String companyLeaderPhone;
}
