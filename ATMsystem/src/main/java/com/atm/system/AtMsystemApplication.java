package com.atm.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class AtMsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtMsystemApplication.class, args);
	}

}
