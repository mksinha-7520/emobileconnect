package com.hcl.emobileconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.hcml.emobileconnect.entity")
public class EmobileconnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmobileconnectApplication.class, args);
	}

}
