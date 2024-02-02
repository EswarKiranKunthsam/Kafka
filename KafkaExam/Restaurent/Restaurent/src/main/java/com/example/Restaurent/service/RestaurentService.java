package com.example.Restaurent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RestaurentService {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    public boolean getServiceRestaurent(String s) {
        kafkaTemplate.send("restaurent", s);
        return true;
    }
}
