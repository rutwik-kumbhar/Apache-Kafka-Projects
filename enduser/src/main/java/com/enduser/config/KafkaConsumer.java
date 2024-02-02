package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {


    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME , groupId = AppConstants.GROUP_ID)
    public void updateLocation(String value){
        System.out.println(value);
    }
}
