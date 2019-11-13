package com.ssmshop.dao;

import com.ssmshop.pojo.GoodsAttr;
import com.ssmshop.pojo.GoodsAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttrMapper {
    int countByExample(GoodsAttrExample example);

    int deleteByExample(GoodsAttrExample example);

    int deleteByPrimaryKey(Integer goodsAttrId);

    int insert(GoodsAttr record);

    int insertSelective(GoodsAttr record);

    List<GoodsAttr> selectByExampleWithBLOBs(GoodsAttrExample example);

    List<GoodsAttr> selectByExample(GoodsAttrExample example);

    GoodsAttr selectByPrimaryKey(Integer goodsAttrId);

    int updateByExampleSelective(@Param("record") GoodsAttr record, @Param("example") GoodsAttrExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsAttr record, @Param("example") GoodsAttrExample example);

    int updateByExample(@Param("record") GoodsAttr record, @Param("example") GoodsAttrExample example);

    int updateByPrimaryKeySelective(GoodsAttr record);

    int updateByPrimaryKeyWithBLOBs(GoodsAttr record);

    int updateByPrimaryKey(GoodsAttr record);
}