package com.ypi.test;


import com.ypi.bean.Notetalk;
import com.ypi.dao.NotetalkMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MapperTest {

    @Autowired
    NotetalkMapper notetalkMapper;

    @Test
    public void test(){
        notetalkMapper.insertSelective(new Notetalk(1,"a","b","c"));
        System.out.println("插入成功");
    }


}
