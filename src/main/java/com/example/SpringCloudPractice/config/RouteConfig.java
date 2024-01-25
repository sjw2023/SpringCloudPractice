package com.example.SpringCloudPractice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator locator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("cloud-practice-server", r->r.path("/test1").uri("http://127.0.0.1:8081"))
                .route("cloud-practice-server2", r->r.path("/test2").uri("http://127.0.0.1:8082"))
                .build();

    }

}
