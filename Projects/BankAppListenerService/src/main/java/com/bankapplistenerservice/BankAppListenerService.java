package com.bankapplistenerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class BankAppListenerService {

	public static void main(String[] args) {
		SpringApplication.run(BankAppListenerService.class, args);
	}

}
