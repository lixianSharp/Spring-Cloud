package com.atguigu.springcloud.alibaba.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lxy
 * @Date 2020/8/11
 * @Descript
 **/
@Data
@AllArgsConstructor //全参构造函数
@NoArgsConstructor //午餐构造函数
public class Payment {

    private Long id;
    private String serial;
}
