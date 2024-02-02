package com.example.Wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Service
public class WalletService {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    String simpledateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(System.currentTimeMillis());

    @KafkaListener(topics = "restaurent", groupId = "user-group")
    public void getRestaurentMessage(String str){
        System.out.println(str);
        kafkaTemplate.send("wallet", str);
    }

    @KafkaListener(topics = "customer", groupId = "user-group")
    public void getCustomerMessage(String str){
        System.out.println(str);
    }

}
