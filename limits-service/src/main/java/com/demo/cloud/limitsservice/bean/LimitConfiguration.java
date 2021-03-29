package com.demo.cloud.limitsservice.bean;



/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:06 PM ,February 28,2021
 */


public class LimitConfiguration {
    private Integer minimum;
    private Integer maximum;
    
    public LimitConfiguration() {
    }
    
    public LimitConfiguration(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
    
    public Integer getMinimum() {
        return minimum;
    }
    
    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }
    
    public Integer getMaximum() {
        return maximum;
    }
    
    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
