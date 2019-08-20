package com.example.demo.mapper;

import com.example.demo.pojo.BalanceInfo;
import com.example.demo.pojo.BalanceInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BalanceInfoMapper {
    long countByExample(BalanceInfoExample example);

    int deleteByExample(BalanceInfoExample example);

    int deleteByPrimaryKey(String productId);

    int insert(BalanceInfo record);

    int insertSelective(BalanceInfo record);

    List<BalanceInfo> selectByExample(BalanceInfoExample example);

    BalanceInfo selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") BalanceInfo record, @Param("example") BalanceInfoExample example);

    int updateByExample(@Param("record") BalanceInfo record, @Param("example") BalanceInfoExample example);

    int updateByPrimaryKeySelective(BalanceInfo record);

    int updateByPrimaryKey(BalanceInfo record);
    
    List<BalanceInfo> selectAllBalanceInfo();
}