package com.cloud.zuulapigatewayserver.bean;

import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:39 PM ,March 07,2021
 */
@Configuration
public class SampleBean {
    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
