package com.microservices.limitservice.controller;

import com.microservices.limitservice.bean.LimitConfiguration;
import com.microservices.limitservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:04 PM ,February 28,2021
 */
@RestController
public class LimitConfigController {
    
    @Autowired
    private Configuration configuration;
    
    @GetMapping("/limits")
    public LimitConfiguration retrievelLimitsFromConfigurations(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
    
    @GetMapping("/limits-set")
    public LimitConfiguration setConfig(@RequestParam Integer minimum,@RequestParam Integer maximum){
        configuration.setMaximum(maximum);
        configuration.setMinimum(minimum);
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
