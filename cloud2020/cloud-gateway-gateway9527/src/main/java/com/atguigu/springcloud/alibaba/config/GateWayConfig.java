package com.atguigu.springcloud.alibaba.config;

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

    /**
     * 代码中注入RouteLocator的Bean的配置：
     *  当访问地址http://localhost:9527/guonei时会自动转发到地址：http://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguitu",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }


    @Bean
    public RouteLocator customerRouteLocator2(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_atguigu2",r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

}
