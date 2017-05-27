package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaopan
 * @Date 2017-05-25
 **/
@RefreshScope
@RestController
public class ConfigClientController {
    @Value("${env}")
    String env;

    @RequestMapping(value = "/hi")
    public String hi() {
        return env+"8884";
    }
}
