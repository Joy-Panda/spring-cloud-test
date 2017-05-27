package com.springcloud.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
@SpringBootApplication
@EnableEurekaClient

public class RibbonApplication {
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate restTemplate() {  // equals to RestTemplate restTemplate = new RestTemplate()
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}
