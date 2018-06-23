package com.example.demo.entity;

public class UserBaseInfo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWebChat() {
        return webChat;
    }

    public void setWebChat(String webChat) {
        this.webChat = webChat;
    }

    public String getChsiAccount() {
        return chsiAccount;
    }

    public void setChsiAccount(String chsiAccount) {
        this.chsiAccount = chsiAccount;
    }

    public String getChsiPwd() {
        return chsiPwd;
    }

    public void setChsiPwd(String chsiPwd) {
        this.chsiPwd = chsiPwd;
    }

    private String name;
    private String phone;
    private String idCard;
    private String qq;
    private String webChat;
    private String chsiAccount;
    private String chsiPwd;
}
