package com.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.boot.*")
@EntityScan(basePackages="com.boot.model")
@EnableJpaRepositories(basePackages = "com.boot.repositories")
public class FirstbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootApplication.class, args);
	}

}
