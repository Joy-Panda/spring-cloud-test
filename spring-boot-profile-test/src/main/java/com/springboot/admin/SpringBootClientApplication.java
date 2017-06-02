package com.springboot.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaopan
 * @Date 2017-05-27
 **/
@SpringBootApplication
@RestController
public class SpringBootClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootClientApplication.class, args);
    }

    @Value("value")
    private String value;
    @Value("value1")
    private String value1;
    @Value("value2")
    private String value2;
    @Value("value3")
    private String value3;
    @Value("value4")
    private String value4;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String add() {

        return value+value1+value2+value3+value4;
    }
}
