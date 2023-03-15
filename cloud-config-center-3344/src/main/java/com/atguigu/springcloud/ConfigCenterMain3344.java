package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yuanyi
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2023/3/10 22:26
 * @updateDate 2023/3/10 22:26
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344 .class,args);
    }
}
