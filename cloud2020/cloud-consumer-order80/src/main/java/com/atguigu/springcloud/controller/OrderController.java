package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lxy
 * @Date 2020/8/12
 * @Descript
 **/
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8001";
    //订单服务访问地址不能写死，集群的时候应该写成 订单服务在EurekaServer中的服务名
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        log.info("准备插入数据..");
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id) {
        /**
         *  restTemplate两个方法的区别 如果需要更详细的信息，用 getForEntity，如果只需要json传，用 getForObject,推荐使用 getForObject
         *  restTemplate两个方法的区别 如果需要更详细的信息，用 postForEntity，如果只需要json传，用 postForObject,推荐使用 postForObject
         */

        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            log.info(entity.getHeaders()+"\t"+entity.getStatusCode()+"\t"+entity.getStatusCodeValue());
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }

    }
}
