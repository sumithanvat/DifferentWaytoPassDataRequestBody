package com.bridgelabz.SpringBoot_Employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class SpringBootEmployeeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootEmployeeApplication.class, args);
		log.debug("debug : welcome to spring boot !!");
	}

}
