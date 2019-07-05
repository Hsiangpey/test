package com.it.entity;

public enum LoginInfo {

    PASSWORD_CHECK_FAILED(2000,"密码校验成功!"),  //登陆成功 !

    PASSWORD_CHECK_SUCCESS(10001,"密码校验失败!"),//密码校验失败!

    USERNAME_NOTEXISTS(10000,"用户名不存在!"),// 登陆失败 !

    SYSTEM_NOT_RESPONSE(0000,"系统未响应!"); //系统未响应!

    private Integer loginStatus;
    private String text;

    private LoginInfo(Integer loginStatus,String text){
        this.loginStatus = loginStatus;
        this.text = text;
    }

    private int getLoginStatus(){
        return loginStatus;
    }

    private String getText(){
        return text;
    }
}
