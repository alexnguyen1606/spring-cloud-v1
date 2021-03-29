package com.cloud.currencyexchangeservice.model;

import java.math.BigDecimal;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:56 PM ,March 06,2021
 */
public class ExchangeValue {
    private long id;
    public String from;
    public String to;
    private BigDecimal conversionMultiple;
    private int port;
    
    
    public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }
    
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public ExchangeValue() {
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public String getTo() {
        return to;
    }
    
    public void setTo(String to) {
        this.to = to;
    }
    
    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }
    
    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
