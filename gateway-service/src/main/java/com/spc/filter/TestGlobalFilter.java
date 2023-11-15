//package com.spc.filter;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class TestGlobalFilter implements GlobalFilter, Ordered {
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        // 在此处编写自定义的过滤逻辑
//        ServerHttpRequest request = exchange.getRequest();
//        request.beforeCommit
//        HttpHeaders headers = request.getHeaders();
//        headers.add("name","spc");
//        ServerHttpRequest modifiedRequest = request.mutate()
//                .headers(httpHeaders -> httpHeaders.addAll(headers))
//                .build();
//        return chain.filter(exchange.mutate().request(modifiedRequest).build());
//    }
//
//    @Override
//    public int getOrder() {
//        // 定义过滤器的顺序，数字越小，优先级越高
//        return 0;
//    }
//}
//
