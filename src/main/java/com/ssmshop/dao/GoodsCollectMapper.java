package com.ssmshop.dao;

import com.ssmshop.pojo.GoodsCollect;
import com.ssmshop.pojo.GoodsCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCollectMapper {
    int countByExample(GoodsCollectExample example);

    int deleteByExample(GoodsCollectExample example);

    int deleteByPrimaryKey(Integer collectId);

    int insert(GoodsCollect record);

    int insertSelective(GoodsCollect record);

    List<GoodsCollect> selectByExample(GoodsCollectExample example);

    GoodsCollect selectByPrimaryKey(Integer collectId);

    int updateByExampleSelective(@Param("record") GoodsCollect record, @Param("example") GoodsCollectExample example);

    int updateByExample(@Param("record") GoodsCollect record, @Param("example") GoodsCollectExample example);

    int updateByPrimaryKeySelective(GoodsCollect record);

    int updateByPrimaryKey(GoodsCollect record);
}