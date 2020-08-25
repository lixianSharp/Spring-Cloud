package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author lxy
 * @Date 2020/8/25
 * @Descript
 **/
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面

    public ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
