package com.example.demo.pojo;

import java.util.Date;

import lombok.Data;
@Data
public class BalanceInfo {
    private String productId;

    private Long maintainFee;

    private Long stuffFee;

    private String guaranteePromise;

    private String noticeItem;

    private Date balanceDate;

 
}