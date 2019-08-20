package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BalanceInfoMapper;
import com.example.demo.pojo.BalanceInfo;
import com.example.demo.service.BalanceinfoService;
@Service
public class BalanceinfoServiceImp implements BalanceinfoService {
    @Autowired
	private BalanceInfoMapper balanceinfoMapper=null;
	
	@Override
	public List<BalanceInfo> selectAllBalanceInfo() {
		List<BalanceInfo> rslist = balanceinfoMapper.selectAllBalanceInfo();
		return rslist;
	}
	@Override
	public BalanceInfo selectBalanceInfoByproductId(String productId) {
		System.out.println("ok");
		BalanceInfo rs = balanceinfoMapper.selectByPrimaryKey(productId);
		return rs;
	}
	@Override
	public int insertBalanceInfo(BalanceInfo record) {		
        int rs = balanceinfoMapper.insert(record);
		return rs;	
	}
}
