package com.it.controller;

import com.it.entity.LoginInfo;
import com.it.entity.LoginUserInfo;
import com.it.entity.User;
import com.it.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/userCheck.do",method = RequestMethod.POST)
    public LoginInfo checkUser(@RequestBody User requestUser){
        User user = userService.findUserInfoByUserName(requestUser.getUserName());
        if (user==null){
            return LoginInfo.USERNAME_NOTEXISTS;
        }else if (requestUser.equals(user)){
            return LoginInfo.PASSWORD_CHECK_SUCCESS;
        }else if (!requestUser.equals(user)){
            return LoginInfo.PASSWORD_CHECK_FAILED;
        }
        return LoginInfo.SYSTEM_NOT_RESPONSE;
    }

}
