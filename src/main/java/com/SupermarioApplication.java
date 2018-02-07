package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.model.User;

@SpringBootApplication
@EnableConfigurationProperties({ User.class })
public class SupermarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarioApplication.class, args);
	}
}
