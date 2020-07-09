package com.zuera.firstkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class FirstKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstKafkaApplication.class, args);
	}

	@KafkaListener(topics = "users")
	public void listen(String message) {
		System.out.println("Received Messasge in group foo: " + message);
	}

}
