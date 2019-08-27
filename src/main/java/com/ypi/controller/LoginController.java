package com.ypi.controller;

import com.ypi.bean.Msg;
import com.ypi.bean.Userinfo;
import com.ypi.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserInfoService userinfoService;

    @ResponseBody
    @RequestMapping(value = "/userLogon", method = RequestMethod.POST)
    public Msg userLogon (String testmsg) {
        System.out.println("waitfor..");
        userinfoService.apiTest(testmsg);

        System.out.println(testmsg);

        System.out.println("success");
        return Msg.success();

    }
}
