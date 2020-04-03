package org.java.restapi.demotest.demo_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjApplication.class, args);
		System.out.println("application started");
	}

}
