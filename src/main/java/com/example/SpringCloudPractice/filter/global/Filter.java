package com.example.SpringCloudPractice.filter.global;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;

@Configuration
@Slf4j
public class Filter {
    @Bean
    public GlobalFilter doGatewayFilter(){
        return ( exchange, chain ) -> {
            log.info("headers : {}", exchange.getRequest().getHeaders() );
            return chain.filter(exchange);
        };
    }
}
