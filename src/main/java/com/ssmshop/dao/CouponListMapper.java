package com.ssmshop.dao;

import com.ssmshop.pojo.CouponList;
import com.ssmshop.pojo.CouponListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponListMapper {
    int countByExample(CouponListExample example);

    int deleteByExample(CouponListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponList record);

    int insertSelective(CouponList record);

    List<CouponList> selectByExample(CouponListExample example);

    CouponList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponList record, @Param("example") CouponListExample example);

    int updateByExample(@Param("record") CouponList record, @Param("example") CouponListExample example);

    int updateByPrimaryKeySelective(CouponList record);

    int updateByPrimaryKey(CouponList record);
}