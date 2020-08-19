package com.mediscreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MircoServiceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircoServiceApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes().route(r -> r.path("/note/**").uri("lb://MICRO-NOTE").id("micro-note"))
				.route(r -> r.path("/patient/**").uri("lb://MICRO-PATIENT").id("micro-patient"))
				.route(r -> r.path("/rapport/**").uri("lb://MICRO-RAPPORT").id("micro-rapport")).build();
	}

}