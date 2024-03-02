package com.example.apigatewaysample.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@ComponentScan
@EnableWebFlux
public class ApiGatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("HomeX",
                        r -> r.path("/base/**")
                                .and().method(HttpMethod.POST.name(), HttpMethod.PUT.name(), HttpMethod.GET.name(), HttpMethod.DELETE.name(), HttpMethod.PATCH.name())
                                .and().uri("http://localhost:8081"))
                .route("micro-service-2",
                        r -> r.path("/base/**")
                                .and().method(HttpMethod.POST.name(), HttpMethod.PUT.name(), HttpMethod.GET.name(), HttpMethod.DELETE.name(), HttpMethod.PATCH.name())
                                .and().uri("http://localhost:8081"))
                .build();
    }

}
