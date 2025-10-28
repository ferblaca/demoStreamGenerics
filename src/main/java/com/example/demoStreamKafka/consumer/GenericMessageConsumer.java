package com.example.demoStreamKafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

public class GenericMessageConsumer<T> implements Consumer<Message<T>> {

	private static final Logger LOG = LoggerFactory.getLogger(GenericMessageConsumer.class);

	private final String name;

	public GenericMessageConsumer(String name) {
		this.name = name;
	}

	@Override
	public void accept(Message<T> message) {
		LOG.info("Received Message {} Consumer: {}", this.name, message);
	}
}
