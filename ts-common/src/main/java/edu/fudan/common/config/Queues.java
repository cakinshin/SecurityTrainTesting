package edu.fudan.common.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Queues {

    public final static String queueName = "state";

    @Bean
    public Queue crudQueue() {
        return new Queue(queueName);
    }
}