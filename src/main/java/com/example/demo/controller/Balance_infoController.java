package com.example.demo.controller;


import java.sql.Date;
import java.util.ArrayList;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.BalanceInfo;
import com.example.demo.service.BalanceinfoService;
import com.example.demo.test.ResultMap;

@RestController
@RequestMapping("/balance_infobalance_info")
@Transactional( rollbackFor =Exception.class)
public class Balance_infoController {
	@Autowired
   private  BalanceinfoService balanceInfoService=null;
	@Value("${server.port}")
   private String port=null;	
	 /* 获取所有的维修清单 */
	@RequestMapping("/table")
	@ResponseBody
    public ResultMap getList(){
    	List<BalanceInfo> list=new ArrayList<BalanceInfo>();
    	System.out.println("进入方法");
        List<BalanceInfo> rs = balanceInfoService.selectAllBalanceInfo();
        if(rs==null) {System.out.println("查询结构为空");}        
        ResultMap<Object> resultMap = new ResultMap<>();
        resultMap.setCode(0);
        resultMap.setMsg("ok");
        resultMap.setCount(3);
        resultMap.setData(rs);
        
        
		return resultMap;
    }
	/*
	 *   insert 只要not null 的列表给了值，就不会报错
	 *   
	 *   
	 * */
    @RequestMapping("/insert")
	public String insertBalanceInfo() { 
		BalanceInfo balanceInfo = new BalanceInfo();
		Date date = new Date(1000);
		balanceInfo.setBalanceDate(date);
	    balanceInfo.setProductId("1004");
	    int k=10/0;
	    int a=30;
	    balanceInfo.setMaintainFee(Integer.toUnsignedLong(30));
		int rs = balanceInfoService.insertBalanceInfo(balanceInfo);
		if(rs==-1) {
			return "增加失败！";
		}
		return "增加成功！";
	}
    @RequestMapping("/ok")
    public String onok() {
    	System.out.println("您已经进入TestSpringCloudClient服务:"+port);
    	
    	
    	return "ok";
    }
}
