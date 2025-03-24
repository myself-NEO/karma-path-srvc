package com.neo.karmapath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KarmapathApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarmapathApplication.class, args);
	}

}
