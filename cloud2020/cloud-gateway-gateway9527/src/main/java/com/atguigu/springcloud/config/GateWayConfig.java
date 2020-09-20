package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lxy
 * @Date 2020/9/20
 * @Descript: Gate网关路由的第二种配置方式：代码中注入RouteLocator的Bean
 **/
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguitu",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

}
