package com.springcloud.consumer.feign.controller;

import com.springcloud.consumer.feign.service.FeignConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
@RestController
public class FeignController {

    @Autowired
    FeignConsumerClient feignConsumerClient;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b){
        return feignConsumerClient.add(a,b);
    }

}
