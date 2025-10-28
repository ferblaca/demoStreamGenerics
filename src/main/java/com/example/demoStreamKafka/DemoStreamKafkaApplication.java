package com.example.demoStreamKafka;

import com.example.demoStreamKafka.dto.ProductCompleteDTO;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Properties;

@SpringBootApplication
public class DemoStreamKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStreamKafkaApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner2(StreamBridge streamBridge) {
        return args -> {
            // send a message
            final ProductCompleteDTO productCompleteDTO = new ProductCompleteDTO(1L, "name", "description", 1.0, 1, "category");
            productCompleteDTO.setCategory("new Category");
            streamBridge.send("foo-out-0", MessageBuilder.withPayload(productCompleteDTO).build());
        };
    }



}
