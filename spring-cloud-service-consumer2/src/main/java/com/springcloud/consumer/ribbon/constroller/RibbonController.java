package com.springcloud.consumer.ribbon.constroller;

import com.springcloud.consumer.config.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
@RestController
@RibbonClient(name = "service", configuration = RibbonConfiguration.class)
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://service/add?a=10&b=20", String.class).getBody();
    }
}
