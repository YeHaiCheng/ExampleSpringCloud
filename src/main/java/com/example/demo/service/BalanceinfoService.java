package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.BalanceInfo;

public interface BalanceinfoService {
      /*查询所有的维修信息*/	
	 public List<BalanceInfo> selectAllBalanceInfo();
	 /*查询某个id的维修信息*/
	 public BalanceInfo selectBalanceInfoByproductId(String productId);
	 /* 增加一个维护id*/
	 public int insertBalanceInfo(BalanceInfo record);
		 
}
