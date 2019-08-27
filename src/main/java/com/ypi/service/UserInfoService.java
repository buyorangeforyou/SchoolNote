package com.ypi.service;

import com.ypi.bean.Userinfo;
import com.ypi.dao.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserinfoMapper userinfoMapper;

    public void apiTest(String testmsg) {
        System.out.println("servive:");
        System.out.println(testmsg);
    }


    // 用户保存
    public void saveUser(Userinfo userinfo) {
        userinfoMapper.insert(userinfo);
    }
}
