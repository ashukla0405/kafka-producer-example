package com.javatechi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerExampleApplication {

	public static void main(String[] args) {

		System.out.println("KafkaProducerExampleApplication initiated");
		SpringApplication.run(KafkaProducerExampleApplication.class, args);
	}

}
