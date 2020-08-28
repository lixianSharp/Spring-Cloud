package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author lxy
 * @Date 2020/8/28
 * @Descript
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //EurekaServer集群中的支付微服务(目前该名字对应的支付微服务有两个，分别为payment8001和payment8002)。大概意思是：表示访问EurekaServer集群中的这个实例名包含的微服务中的如下接口的时候，feign会自动帮我们做负载均衡。
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
