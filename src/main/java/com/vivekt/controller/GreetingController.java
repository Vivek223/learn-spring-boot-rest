package com.vivekt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @GetMapping("/info")
    public String greet(){
        return "Welcome to the world of learning. We will learn Spring boot with Rest in this tutorial -- it1" ;
    }

    @PostMapping("/sqrt")
    public ResponseEntity<Integer> sqrt(@RequestParam Integer num){
        Integer result = num * num;
        return ResponseEntity.ok(result);
    }
}
