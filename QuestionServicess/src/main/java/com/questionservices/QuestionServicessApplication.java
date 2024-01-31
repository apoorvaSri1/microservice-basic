package com.questionservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuestionServicessApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionServicessApplication.class, args);
	}

}
