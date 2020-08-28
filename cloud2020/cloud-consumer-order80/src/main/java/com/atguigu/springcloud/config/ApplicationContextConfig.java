package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxy
 * @Date 2020/8/12
 * @Descript
 **/
@Configuration
public class ApplicationContextConfig {

    //RestTemplate的功能就类似于 HttpClient,用于发送Rest风格的http请求。

//    @LoadBalanced //使用 @LoadBalance 赋予RestTemplate负载均衡能力   注意：测试自定义的Ribbon的轮训算法的时候，这个注解要注释掉。
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
