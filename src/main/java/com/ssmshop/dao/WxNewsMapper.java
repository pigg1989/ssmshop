package com.ssmshop.dao;

import com.ssmshop.pojo.WxNews;
import com.ssmshop.pojo.WxNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxNewsMapper {
    int countByExample(WxNewsExample example);

    int deleteByExample(WxNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxNews record);

    int insertSelective(WxNews record);

    List<WxNews> selectByExample(WxNewsExample example);

    WxNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxNews record, @Param("example") WxNewsExample example);

    int updateByExample(@Param("record") WxNews record, @Param("example") WxNewsExample example);

    int updateByPrimaryKeySelective(WxNews record);

    int updateByPrimaryKey(WxNews record);
}