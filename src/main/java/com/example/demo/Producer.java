package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void produce() {
        logger.info("Hello World!");
    }
}
