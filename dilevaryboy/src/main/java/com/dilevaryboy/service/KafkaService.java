package com.dilevaryboy.service;


import com.dilevaryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    


    @Autowired
    private KafkaTemplate<String,String> KafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        this.KafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME ,location);
        this.logger.info("message produce");
        return  true;
    }
}
