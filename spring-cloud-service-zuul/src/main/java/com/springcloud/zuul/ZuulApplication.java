package com.springcloud.zuul;

import com.netflix.zuul.FilterProcessor;
import com.springcloud.zuul.filter.MyFilterProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zhaopan
 * @Date 2017-05-25
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        FilterProcessor.setProcessor(new MyFilterProcessor());
    }
}
