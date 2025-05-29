package com.bankappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJpaAuditing
@EnableJms
public class BankAppService {

	public static void main(String[] args) {
		SpringApplication.run(BankAppService.class, args);
	}

}
