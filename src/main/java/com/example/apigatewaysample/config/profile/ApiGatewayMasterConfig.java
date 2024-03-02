package com.example.apigatewaysample.config.profile;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("master")
@EnableDiscoveryClient
@Configuration
public class ApiGatewayMasterConfig {
}
