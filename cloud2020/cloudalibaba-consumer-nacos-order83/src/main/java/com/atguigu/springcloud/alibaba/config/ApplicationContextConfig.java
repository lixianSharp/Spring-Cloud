package com.atguigu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxy
 * @Date 2020/9/18
 * @Descript
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //表示支持负载均衡,默认轮询
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
