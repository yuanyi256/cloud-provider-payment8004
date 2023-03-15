package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yuanyi
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2023/3/2 15:36
 * @updateDate 2023/3/2 15:36
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
