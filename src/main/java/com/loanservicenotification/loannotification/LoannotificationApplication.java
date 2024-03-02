package com.loanservicenotification.loannotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.loanservicenotification.loannotification.dao"})
public class LoannotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoannotificationApplication.class, args);
	}

}
