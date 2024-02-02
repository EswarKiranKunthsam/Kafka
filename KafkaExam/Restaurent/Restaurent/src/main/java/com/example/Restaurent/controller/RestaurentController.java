package com.example.Restaurent.controller;

import com.example.Restaurent.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/restaurent")
public class RestaurentController {

    @Autowired
    RestaurentService restaurentService;

    @GetMapping("/restaurentABC")
    public ResponseEntity getController() throws InterruptedException {
        System.out.println("I am Running Now");
        restaurentService.getServiceRestaurent(String.valueOf("Welcome to restaurentABC"));
        return new ResponseEntity<>(Map.of("Response", "Success"), HttpStatus.OK);
    }
}
