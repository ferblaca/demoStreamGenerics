package com.example.demoStreamKafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import java.util.List;
import java.util.function.Consumer;

public class GebericBatchConsumer<T> implements Consumer<Message<List<T>>> {

    private static final Logger LOG = LoggerFactory.getLogger(GebericBatchConsumer.class);

    private final String name;

    public GebericBatchConsumer(String name) {
        this.name = name;
    }

    /**
     * Performs this operation on the given argument.
     *
     * @param listMessage the input argument
     */
    @Override
    public void accept(Message<List<T>> listMessage) {
        LOG.info("Received Batch {} Consumer: {}", this.name, listMessage.getPayload());
    }
}
