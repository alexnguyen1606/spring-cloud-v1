package com.cloud.currencyexchangeservice.processor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 7:22 PM ,March 07,2021
 */
@Service
public class CurrencyExchangeProcessor {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Cacheable("exchange")
    public int getValueExchange() throws InterruptedException {
        logger.info("Cached");
        return 10;
    }
}
