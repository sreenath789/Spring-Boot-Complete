package com.example.DependencyInjectionCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionCodeApplication implements CommandLineRunner {
    @Autowired
	IDBService idbService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionCodeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String data = idbService.getData();
		System.out.println(data);
	}
}

