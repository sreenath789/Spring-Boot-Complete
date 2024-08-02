package com.example.sreenath.introToSpringBoot.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {
	@Autowired
	Apple apple;
	@Autowired
	Car car;

	@Autowired
	Car car1;



	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//apple object by using @component
		apple.eatApple();
		//car object by using @bean and @configuration class
		car.driveCar();

		car1.driveCar();

		System.out.println("Car object "+car.hashCode());
		System.out.println("Car1 object "+car1.hashCode());



	}
}
