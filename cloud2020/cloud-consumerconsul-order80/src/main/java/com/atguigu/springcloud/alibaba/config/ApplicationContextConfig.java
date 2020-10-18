package com.atguigu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxy
 * @Date 2020/8/19
 * @Descript  配置类
 **/
@Configuration
public class ApplicationContextConfig {

    //RestTemplate的功能就类似于 HttpClient,用于发送Rest风格的http请求。
    @Bean
    @LoadBalanced //使用 @LoadBalance 赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
