package com.springcloud.service;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableTurbine
@RestController
@EnableHystrixDashboard
public class ServiceTurbineApplication {

	public static void main(String[] args) {

			new SpringApplicationBuilder(ServiceTurbineApplication.class).web(true).run(args);
	}
}
