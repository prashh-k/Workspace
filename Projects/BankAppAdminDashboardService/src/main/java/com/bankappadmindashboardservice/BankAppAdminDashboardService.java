package com.bankappadmindashboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class BankAppAdminDashboardService {

	public static void main(String[] args) {
		SpringApplication.run(BankAppAdminDashboardService.class, args);
	}

}

