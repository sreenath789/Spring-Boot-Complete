package com.example.sreenath.introToSpringBoot.IntroToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarConfiguration {

    @Bean
    @Scope("prototype")
    Car getCar(){
        return new Car();
    }

    @PostConstruct
    void callThisBeforeBeanCreation(){
        System.out.println("Before Bean Creation");
    }

    @PreDestroy
    void callThisBeforeBeanDestroy(){
        System.out.println("Before Bean destroy");
    }
}
