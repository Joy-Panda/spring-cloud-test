package com.springcloud.dashbord;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaopan
 * @Date 2017-06-02
 **/
@SpringBootApplication
@EnableCloudDashboard
@EnableDiscoveryClient
public class DashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashbordApplication.class, args);
    }

}
