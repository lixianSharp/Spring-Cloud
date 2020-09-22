package com.atguigu.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxy
 * @Date 2020/9/22
 * @Descript
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
//        //暂停0.8秒
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "----testA";
    }


    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName()+"\t"+".....testB");
        return "----testB";
    }

}
