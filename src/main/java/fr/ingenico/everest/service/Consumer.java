package fr.ingenico.everest.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    private static final Logger logger =  LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "Axis",groupId = "group-id")
    public void consume(String message){
    logger.info(String.format("--> Consumed Message : %s",message));
    }

}
