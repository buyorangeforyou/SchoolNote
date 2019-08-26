package com.ypi.dao;

import com.ypi.bean.Usernote;
import com.ypi.bean.UsernoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsernoteMapper {
    long countByExample(UsernoteExample example);

    int deleteByExample(UsernoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usernote record);

    int insertSelective(Usernote record);

    List<Usernote> selectByExample(UsernoteExample example);

    Usernote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usernote record, @Param("example") UsernoteExample example);

    int updateByExample(@Param("record") Usernote record, @Param("example") UsernoteExample example);

    int updateByPrimaryKeySelective(Usernote record);

    int updateByPrimaryKey(Usernote record);
}