package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lxy
 * @Date 2020/8/10
 * @Descript 主启动
 **/
@SpringBootApplication
@EnableEurekaClient //该注解用于向使用consul或者zookeeper作为注册中心是注册服务
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run((PaymentMain8002.class), args);
    }
}
