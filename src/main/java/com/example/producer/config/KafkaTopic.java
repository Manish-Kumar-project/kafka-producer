package com.example.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {


    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javatechie17")
                .build();
    }
}
