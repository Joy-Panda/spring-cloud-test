package com.springboot.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaopan
 * @Date 2017-05-27
 **/
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class SpringBootEurekaAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaAdminApplication.class, args);
    }
}
