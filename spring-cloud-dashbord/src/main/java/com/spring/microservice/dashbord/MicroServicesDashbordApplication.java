package com.spring.microservice.dashbord;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaopan
 * @Date 2017-06-02
 **/
@SpringBootApplication
@EnableMicroservicesDashboardServer
public class MicroServicesDashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicesDashbordApplication.class, args);
    }
}
