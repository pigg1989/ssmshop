package com.ssmshop.dao;

import com.ssmshop.pojo.WxMsg;
import com.ssmshop.pojo.WxMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxMsgMapper {
    int countByExample(WxMsgExample example);

    int deleteByExample(WxMsgExample example);

    int deleteByPrimaryKey(Integer msgid);

    int insert(WxMsg record);

    int insertSelective(WxMsg record);

    List<WxMsg> selectByExampleWithBLOBs(WxMsgExample example);

    List<WxMsg> selectByExample(WxMsgExample example);

    WxMsg selectByPrimaryKey(Integer msgid);

    int updateByExampleSelective(@Param("record") WxMsg record, @Param("example") WxMsgExample example);

    int updateByExampleWithBLOBs(@Param("record") WxMsg record, @Param("example") WxMsgExample example);

    int updateByExample(@Param("record") WxMsg record, @Param("example") WxMsgExample example);

    int updateByPrimaryKeySelective(WxMsg record);

    int updateByPrimaryKeyWithBLOBs(WxMsg record);

    int updateByPrimaryKey(WxMsg record);
}