package com.ssmshop.dao;

import com.ssmshop.pojo.SystemMenu;
import com.ssmshop.pojo.SystemMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMenuMapper {
    int countByExample(SystemMenuExample example);

    int deleteByExample(SystemMenuExample example);

    int deleteByPrimaryKey(Short id);

    int insert(SystemMenu record);

    int insertSelective(SystemMenu record);

    List<SystemMenu> selectByExampleWithBLOBs(SystemMenuExample example);

    List<SystemMenu> selectByExample(SystemMenuExample example);

    SystemMenu selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") SystemMenu record, @Param("example") SystemMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") SystemMenu record, @Param("example") SystemMenuExample example);

    int updateByExample(@Param("record") SystemMenu record, @Param("example") SystemMenuExample example);

    int updateByPrimaryKeySelective(SystemMenu record);

    int updateByPrimaryKeyWithBLOBs(SystemMenu record);

    int updateByPrimaryKey(SystemMenu record);
}