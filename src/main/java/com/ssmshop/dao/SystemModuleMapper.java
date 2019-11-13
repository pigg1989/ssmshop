package com.ssmshop.dao;

import com.ssmshop.pojo.SystemModule;
import com.ssmshop.pojo.SystemModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemModuleMapper {
    int countByExample(SystemModuleExample example);

    int deleteByExample(SystemModuleExample example);

    int deleteByPrimaryKey(Short modId);

    int insert(SystemModule record);

    int insertSelective(SystemModule record);

    List<SystemModule> selectByExample(SystemModuleExample example);

    SystemModule selectByPrimaryKey(Short modId);

    int updateByExampleSelective(@Param("record") SystemModule record, @Param("example") SystemModuleExample example);

    int updateByExample(@Param("record") SystemModule record, @Param("example") SystemModuleExample example);

    int updateByPrimaryKeySelective(SystemModule record);

    int updateByPrimaryKey(SystemModule record);
}