package com.atguigu.springcloud.alibaba;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lxy
 * @Date 2020/8/10
 * @Descript 主启动
 **/
@SpringBootApplication
@EnableEurekaClient    //这个注解只有使用Eureka的时候才需要，如果是Zookeeper或consul的话，不需要这个注解
@EnableDiscoveryClient
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run((PaymentMain8001.class), args);
    }
}
