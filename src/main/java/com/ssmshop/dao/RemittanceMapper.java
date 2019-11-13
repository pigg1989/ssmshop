package com.ssmshop.dao;

import com.ssmshop.pojo.Remittance;
import com.ssmshop.pojo.RemittanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemittanceMapper {
    int countByExample(RemittanceExample example);

    int deleteByExample(RemittanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Remittance record);

    int insertSelective(Remittance record);

    List<Remittance> selectByExample(RemittanceExample example);

    Remittance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Remittance record, @Param("example") RemittanceExample example);

    int updateByExample(@Param("record") Remittance record, @Param("example") RemittanceExample example);

    int updateByPrimaryKeySelective(Remittance record);

    int updateByPrimaryKey(Remittance record);
}