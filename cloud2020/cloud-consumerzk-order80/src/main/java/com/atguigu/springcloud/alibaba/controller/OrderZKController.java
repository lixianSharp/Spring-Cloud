package com.atguigu.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lxy
 * @Date 2020/8/18
 * @Descript
 **/
@Slf4j
@RestController
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/comsumer/paymentzk")
    public String paymentInfo() {
        //在 payment8004中的地址
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);

        return result;
    }
}
