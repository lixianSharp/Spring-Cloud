package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author lxy
 * @Date 2020/8/11
 * @Descript :传给前端的通用的返回数据及结果码
 **/
@Data
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor  //无参构造方法
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
