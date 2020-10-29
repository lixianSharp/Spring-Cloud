package com.atguigu.springcloud.alibaba.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxy
 * @Date 2020/9/24
 * @Descript
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced   //这个注解表示开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}


