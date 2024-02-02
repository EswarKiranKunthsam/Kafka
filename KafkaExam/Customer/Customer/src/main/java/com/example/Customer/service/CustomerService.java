package com.example.Customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class CustomerService {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    @KafkaListener(topics = "wallet", groupId = "user-group")
    public void getWallet(String str){
        System.out.println(str);
        kafkaTemplate.send("customer", "Thank You");
    }

}
