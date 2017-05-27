package com.springcloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author zhaopan
 * @Date 2017-05-26
 **/
@SpringBootApplication
@EnableZipkinServer
public class ServiceZipkinApplication {


        public static void main(String[] args) {
            SpringApplication.run(ServiceZipkinApplication.class, args);
        }

}
