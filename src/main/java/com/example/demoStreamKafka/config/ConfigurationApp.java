package com.example.demoStreamKafka.config;

import com.example.demoStreamKafka.consumer.GenericBatchListConsumer;
import com.example.demoStreamKafka.consumer.GenericBatchMessageListConsumer;
import com.example.demoStreamKafka.consumer.GenericConsumer;
import com.example.demoStreamKafka.consumer.GenericMessageConsumer;
import com.example.demoStreamKafka.dto.ProductCompleteDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.List;
import java.util.function.Consumer;

@Configuration
public class ConfigurationApp {


    @Bean
    public GenericConsumer<ProductCompleteDTO> productConsumer() {
        return new GenericConsumer<>("productConsumer");
    }

    @Bean
    public Consumer<ProductCompleteDTO> productConsumer2() {
        return new GenericConsumer<>("productConsumer2");
    }

    @Bean
    public GenericMessageConsumer<ProductCompleteDTO> productMessageConsumer() {
        return new GenericMessageConsumer<>("productMessageConsumer");
    }

    @Bean
    public Consumer<Message<ProductCompleteDTO>> productMessageConsumer2() {
        return new GenericMessageConsumer<>("productMessageConsumer2");
    }

    @Bean
    public GenericBatchListConsumer<ProductCompleteDTO> productBatchListConsumer() {
        return new GenericBatchListConsumer<>("productBatchListConsumer");
    }

    @Bean
    public Consumer<List<ProductCompleteDTO>> productBatchListConsumer2() {
        return new GenericBatchListConsumer<>("productBatchListConsumer2");
    }

    @Bean
    public GenericBatchMessageListConsumer<ProductCompleteDTO> productBatchListMessageConsumer() {
        return new GenericBatchMessageListConsumer<>("productBatchListMessageConsumer");
    }

    @Bean
    public Consumer<Message<List<ProductCompleteDTO>>> productBatchListMessageConsumer2() {
        return new GenericBatchMessageListConsumer<>("productBatchListMessageConsumer2");
    }

}
