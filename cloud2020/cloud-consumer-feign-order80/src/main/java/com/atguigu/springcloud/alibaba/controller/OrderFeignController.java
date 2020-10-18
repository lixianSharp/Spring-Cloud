package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.entities.CommonResult;
import com.atguigu.springcloud.alibaba.entities.Payment;
import com.atguigu.springcloud.alibaba.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lxy
 * @Date 2020/8/28
 * @Descript
 **/
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    //服务消费方80添加超时方法，用于测试feign的超时
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon,客户端默认等待1秒钟
        //但是服务端处理需要超过1秒钟，导致feign客户端不想等待了，直接返回报错。为了避免这样的情况，有时候我们需要设置feign客户端的超时控制，如何设置呢？在yml文件中开启配置
        return paymentFeignService.paymentFeignTimeout();
    }

}
