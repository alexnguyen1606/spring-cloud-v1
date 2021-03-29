package com.cloud.currencyconversionservice.api;

import com.cloud.currencyconversionservice.api.external.CurrencyExchangeProxy;
import com.cloud.currencyconversionservice.model.CurrencyConversion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:54 PM ,March 06,2021
 */
@RestController
public class CurrencyConversionApi {
    @Autowired
    private CurrencyExchangeProxy currencyExchangeResource;
    private final Logger logger = LogManager.getLogger(CurrencyConversionApi.class);
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to,@PathVariable Integer quantity){
       CurrencyConversion currencyConversion = currencyExchangeResource.retrieveExchangeValue(from,to);
       currencyConversion.setQuantity(quantity);
       logger.info("{}",currencyConversion);
       
       return currencyConversion;
    }
}
