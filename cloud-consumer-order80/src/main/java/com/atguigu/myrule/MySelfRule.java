package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuanyi
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2023/2/28 14:35
 * @updateDate 2023/2/28 14:35
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
