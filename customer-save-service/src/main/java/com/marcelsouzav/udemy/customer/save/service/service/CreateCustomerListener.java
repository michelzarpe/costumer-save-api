package com.marcelsouzav.udemy.customer.save.service.service;


import java.util.UUID;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marcelsouzav.udemy.customer.save.service.gateway.json.CustomerJson;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CreateCustomerListener {

    //@Autowired
    //private CreateCustomerService createCustomerService;

    @KafkaListener(topics = "${kafka.topic.request-topic}")
    @SendTo
    public String listen(String json) throws InterruptedException, JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        CustomerJson customerJson = mapper.readValue(json, CustomerJson.class);

        log.info("0 Convert customerJson: "+customerJson.toString());
        
        /*
        UUID uuid = createCustomerService.execute(Customer
                .builder()
                .country(customerJson.getCountry())
                .musicStyle(customerJson.getMusicStyle())
                .name(customerJson.getName())
                .build()
        );
        */
        customerJson.setUuid(UUID.randomUUID().toString());

        log.info("1 Convert customerJson: "+customerJson.toString());
        return mapper.writeValueAsString(customerJson);
    }

}