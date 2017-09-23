package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Consumer {
    @Autowired
    private Producer producer;

    public void consume() {
        producer.produce();
    }
}
