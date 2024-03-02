package com.example.apigatewaysample.config.profile;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("stage")
@EnableDiscoveryClient
@PropertySource("classpath:application-master.yml")
@Configuration
public class ApiGatewayStageConfig {
}
