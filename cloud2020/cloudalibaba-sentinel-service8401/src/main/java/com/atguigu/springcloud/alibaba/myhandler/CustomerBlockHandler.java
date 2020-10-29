package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.alibaba.entities.CommonResult;

/**
 * @author lxy
 * @Date 2020/9/24
 * @Descript: 用于自定义限流处理逻辑
 **/
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息....global HandlerException----1");

    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息....global HandlerException----2");

    }

}
