/*
package com.springcloud.config;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.IntervalTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

*/
/**
 * Sets up pulling configuration from the config server as fixed ratio. This will periodically perform entire endpoint
 * refresh which is similar of manually invoking HTTP POST '/refresh' endpoint causing to ake an request to config
 * server and retrieve the up to date settings and afterwards reload all {@code @RefreshScope} beans.
 *
 * @author zhaopan
 * @Date 2017-05-25
 *//*

@ConditionalOnBean({RefreshEndpoint.class})
@ConditionalOnProperty("spring.cloud.config.refreshInterval")
@AutoConfigureAfter(RefreshAutoConfiguration.class)
@Configuration
public class ConfigAutoRefresh implements SchedulingConfigurer {

    */
/**
     * Logger used by this class.
     *//*

    private static final Log logger = LogFactory.getLog(ConfigAutoRefresh.class);

    */
/**
     * The interval after which the refresh will be perform in seconds.
     *//*

    @Value("${spring.cloud.config.refreshInterval}")
    private long refreshInterval;

    */
/**
     * The refresh endpoint
     *//*

    @Autowired
    private RefreshEndpoint refreshEndpoint;

    */
/**
     * Configures the scheduler by registering task responsible for periodically refreshing entire endpoint.
     *
     * @param taskRegistrar the task registrar
     *//*

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

        final long interval = getRefreshIntervalInMilliseconds();

        logger.info(String.format("Scheduling config refresh task with %s second delay", refreshInterval));

        taskRegistrar.addFixedDelayTask(new IntervalTask(new Runnable() {
            @Override
            public void run() {
                refreshEndpoint.refresh();
            }
        }, interval, interval));
    }

    */
/**
     * Returns the refresh interval in milliseconds.
     *
     * @return the interval in milliseconds.
     *//*

    private long getRefreshIntervalInMilliseconds() {

        return refreshInterval * 1000;
    }

    */
/**
     * Enables the scheduler if none has been registered in the context.
     *
     * @author Jakub Narloch
     *//*

    @ConditionalOnMissingBean(ScheduledAnnotationBeanPostProcessor.class)
    @EnableScheduling
    @Configuration
    protected static class EnableSchedulingConfigProperties {

    }
}
*/
