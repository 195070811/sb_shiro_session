package com.huarui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
public class SbShiroSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbShiroSessionApplication.class, args);
	}

}

