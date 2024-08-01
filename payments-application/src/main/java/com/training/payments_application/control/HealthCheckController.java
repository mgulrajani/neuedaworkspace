package com.training.payments_application.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

    //HTTP method GET  --method --URL
    @GetMapping("/health")
    public  String status(){

        return "OK";

    }

    @GetMapping("/greeting")
    public  String greet(){

        return "hello world!";
    }





}
