package com.ssmshop.dao;

import com.ssmshop.pojo.FriendLink;
import com.ssmshop.pojo.FriendLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendLinkMapper {
    int countByExample(FriendLinkExample example);

    int deleteByExample(FriendLinkExample example);

    int deleteByPrimaryKey(Short linkId);

    int insert(FriendLink record);

    int insertSelective(FriendLink record);

    List<FriendLink> selectByExample(FriendLinkExample example);

    FriendLink selectByPrimaryKey(Short linkId);

    int updateByExampleSelective(@Param("record") FriendLink record, @Param("example") FriendLinkExample example);

    int updateByExample(@Param("record") FriendLink record, @Param("example") FriendLinkExample example);

    int updateByPrimaryKeySelective(FriendLink record);

    int updateByPrimaryKey(FriendLink record);
}