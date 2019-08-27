package com.ypi.test;


import com.ypi.bean.Notetalk;
import com.ypi.dao.NotetalkMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MapperTest {

    @Autowired
    SqlSession sqlSession;

    @Autowired
    NotetalkMapper notetalkMapper;

    @Test
    public void test(){
        NotetalkMapper mapper = sqlSession.getMapper(NotetalkMapper.class);
        for (int i = 0; i < 100 ; i++) {
            mapper.insertSelective(new Notetalk(i+1,"a","b","c"));
        }
        System.out.println("插入笔记成功");
    }


}
