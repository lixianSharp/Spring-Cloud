package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lxy
 * @Date 2020/8/21
 * @Descript
 **/
@Configuration
public class MySelfRule {

    //自定义Ribbon的负载均衡算法
    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}
