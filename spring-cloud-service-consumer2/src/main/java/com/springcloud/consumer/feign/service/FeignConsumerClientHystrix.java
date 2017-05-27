package com.springcloud.consumer.feign.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
@Service
public class FeignConsumerClientHystrix implements FeignConsumerClient{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
