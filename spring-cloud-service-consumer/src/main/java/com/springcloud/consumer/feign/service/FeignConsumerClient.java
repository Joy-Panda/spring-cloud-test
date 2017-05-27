package com.springcloud.consumer.feign.service;

import com.springcloud.consumer.config.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
@FeignClient(value = "service", configuration = FeignConfiguration.class, fallback = FeignConsumerClientHystrix.class)
public interface FeignConsumerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
