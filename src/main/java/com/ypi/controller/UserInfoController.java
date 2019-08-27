package com.ypi.controller;

import com.ypi.bean.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserInfoController {


    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Login(){
        return null;
    }
}
