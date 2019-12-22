package com.husay.gmall.user.controller;

import com.husay.gmall.user.bean.UmsMember;
import com.husay.gmall.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/***
 @program: gmall_01* 
 @description: * 
 @author: hujiang* 
 @create: 2019-12-19 23:16
 **/
@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember>umsMember = userService.getAllUser();
        return umsMember;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "您好！";
    }

}
