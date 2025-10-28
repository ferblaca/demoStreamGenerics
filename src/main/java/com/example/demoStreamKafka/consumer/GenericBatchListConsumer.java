package com.example.demoStreamKafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import java.util.List;
import java.util.function.Consumer;

public class GebericBatchListConsumer<T> implements Consumer<List<T>> {

    private static final Logger LOG = LoggerFactory.getLogger(GebericBatchListConsumer.class);

    private final String name;

    public GebericBatchListConsumer(String name) {
        this.name = name;
    }

    /**
     * Performs this operation on the given argument.
     *
     * @param listMessage the input argument
     */
    @Override
    public void accept(List<T> listMessage) {
        LOG.info("Received Batch List {} Consumer: {}", this.name, listMessage);
    }
}
