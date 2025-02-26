package com.example.demoStreamKafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class GenericConsumer<T> implements Consumer<T> {

    private static final Logger LOG = LoggerFactory.getLogger(GenericConsumer.class);

    private final String name;

    public GenericConsumer(String name) {
        this.name = name;
    }

    @Override
    public void accept(T message) {
        LOG.info("Received {} Consumer: {}", this.name, message);
    }
}
