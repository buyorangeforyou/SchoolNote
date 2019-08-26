package com.ypi.dao;

import com.ypi.bean.Notetalk;
import com.ypi.bean.NotetalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotetalkMapper {
    long countByExample(NotetalkExample example);

    int deleteByExample(NotetalkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notetalk record);

    int insertSelective(Notetalk record);

    List<Notetalk> selectByExample(NotetalkExample example);

    Notetalk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Notetalk record, @Param("example") NotetalkExample example);

    int updateByExample(@Param("record") Notetalk record, @Param("example") NotetalkExample example);

    int updateByPrimaryKeySelective(Notetalk record);

    int updateByPrimaryKey(Notetalk record);
}