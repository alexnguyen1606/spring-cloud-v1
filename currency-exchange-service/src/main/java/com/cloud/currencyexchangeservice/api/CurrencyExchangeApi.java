package com.cloud.currencyexchangeservice.api;

import com.cloud.currencyexchangeservice.model.ExchangeValue;
import com.cloud.currencyexchangeservice.processor.CurrencyExchangeProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 10:56 PM ,March 06,2021
 */
@RestController
public class CurrencyExchangeApi {
    
    @Autowired
    private Environment environment;
    @Autowired private CurrencyExchangeProcessor currencyExchangeProcessor;
    private final Logger logger = LogManager.getLogger(CurrencyExchangeApi.class);
    
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) throws InterruptedException {
        ExchangeValue exchangeValue = new ExchangeValue(currencyExchangeProcessor.getValueExchange(),from,to, BigDecimal.valueOf(10));
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        logger.info("{}",exchangeValue);
        return exchangeValue;
    }
}
