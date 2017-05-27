package com.springcloud.consumer.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
public class RibbonConfiguration {

    @Autowired
    private IClientConfig ribbonClientConfig;


    @Bean
    public IRule ribbonRule(IClientConfig config) {

        return new MyRule();
    }

}
