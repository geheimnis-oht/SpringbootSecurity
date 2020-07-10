package io.laidani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.laidani.configs.SecurityConfig;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[] { SpringBootSecurityApplication.class, SecurityConfig.class}, args);
	}

}
