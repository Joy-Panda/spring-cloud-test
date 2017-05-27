package com.springboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaopan
 * @Date 2017-05-27
 **/
@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaClientApplication.class, args);
    }
}
