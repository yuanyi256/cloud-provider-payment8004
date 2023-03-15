package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuanyi
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2023/2/25 13:17
 * @updateDate 2023/2/25 13:17
 **/
public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取

}
