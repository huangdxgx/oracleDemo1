package com.dongxi.software.entity;

public class User {
    private String userId;//用户id

    private String userName;

    private String longinName;

    private String loginPwd;

    private  String userAddress;

    private  String userStatus;

    private  String userSex;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null:userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    //----
    public String getLoginName() {
        return longinName;
    }

    public void setLoginName(String loginName) {
        this.longinName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }


    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public  String getUserSex(){return  userSex;}
    public  void  setUserSex(String userSex){
        this.userSex = userSex == null ? null :userSex.trim();
    }
}