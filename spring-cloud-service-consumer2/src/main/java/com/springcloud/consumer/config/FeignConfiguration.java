package com.springcloud.consumer.config;

import feign.Feign;
import feign.Retryer;
import feign.hystrix.HystrixFeign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author zhaopan
 * @Date 2017-05-24
 **/
public class FeignConfiguration {

    @Bean
    @Scope("prototype")
    @ConditionalOnProperty(name = "feign.hystrix.enabled", matchIfMissing = false)
    public Feign.Builder feignHystrixBuilder() {
        return HystrixFeign.builder().retryer(feignRetryer());
    }


    /*@Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder(Retryer retryer) {
        return Feign.builder().retryer(retryer);
    }*/

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
}
