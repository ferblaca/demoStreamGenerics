package com.example.demoStreamKafka.config;

import com.example.demoStreamKafka.consumer.GebericBatchConsumer;
import com.example.demoStreamKafka.consumer.GenericConsumer;
import com.example.demoStreamKafka.dto.ProductCompleteDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.List;
import java.util.function.Consumer;

@Configuration
public class ConfigurationApp {


    @Bean
    public GenericConsumer<ProductCompleteDTO> productConsumer_KO() {
        return new GenericConsumer<>("productConsumer_KO");
    }

    @Bean
    public Consumer<ProductCompleteDTO> productConsumer_OK() {
        return new GenericConsumer<>("productConsumer_OK");
    }

    @Bean
    public GebericBatchConsumer<ProductCompleteDTO> productBatchConsumer_KO() {
        return new GebericBatchConsumer<>("productBatchConsumer_KO");
    }

    @Bean
    public Consumer<Message<List<ProductCompleteDTO>>> productBatchConsumer_OK() {
        return new GebericBatchConsumer<>("productBatchConsumer_OK");
    }

}
