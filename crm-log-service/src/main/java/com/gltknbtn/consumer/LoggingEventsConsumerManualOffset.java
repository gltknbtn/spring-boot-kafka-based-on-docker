package com.gltknbtn.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;

//@Component
@Slf4j
public class LoggingEventsConsumerManualOffset implements AcknowledgingMessageListener<Integer,String> {


    @Override
    @KafkaListener(topics = {"log-inout-events"})
    public void onMessage(ConsumerRecord<Integer, String> consumerRecord, Acknowledgment acknowledgment) {
        log.info("ConsumerRecord : {} ", consumerRecord );
        acknowledgment.acknowledge();
    }
}
