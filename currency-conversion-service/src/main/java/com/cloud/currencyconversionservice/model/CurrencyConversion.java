package com.cloud.currencyconversionservice.model;

import java.math.BigDecimal;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 12:00 AM ,March 07,2021
 */

public class CurrencyConversion {
    private long id;
    private String from;
    private String to;
    private Long conversionMultiple;
    private int quantity;
    private Long calculatedAmount;
    private int port;
    
    public CurrencyConversion() {
    }
    
    public CurrencyConversion(long id, String from, String to, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.port = port;
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
    
    public Long getConversionMultiple() {
        return conversionMultiple;
    }
    
    public void setConversionMultiple(Long conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Long getCalculatedAmount() {
        return calculatedAmount;
    }
    
    public void setCalculatedAmount(Long calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
}
