package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lxy
 * @Date 2020/8/28
 * @Descript
 **/
@SpringBootApplication
@EnableFeignClients   //使用Feign，激活并开启
public class OrderFeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignOrder80.class, args);
    }
}
