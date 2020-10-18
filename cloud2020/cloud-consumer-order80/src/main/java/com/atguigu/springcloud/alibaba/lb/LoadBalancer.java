package com.atguigu.springcloud.alibaba.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author lxy
 * @Date 2020/8/25
 * @Descript 实现本地负载均衡器，进而进行负载均衡
 **/
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面

    public ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
