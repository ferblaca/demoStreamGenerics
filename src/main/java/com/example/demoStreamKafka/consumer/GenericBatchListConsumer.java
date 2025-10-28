package com.example.demoStreamKafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;

public class GenericBatchListConsumer<T> implements Consumer<List<T>> {

    private static final Logger LOG = LoggerFactory.getLogger(GenericBatchListConsumer.class);

    private final String name;

    public GenericBatchListConsumer(String name) {
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
