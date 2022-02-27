package com.project.RESTful;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEncryptableProperties
@EnableJpaRepositories(basePackages = { "com.project.repository" })
@EntityScan("com.project.entity")
@ComponentScan(basePackages = { "com.project.controller" })
@EnableWebMvc
public class ResTfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulApplication.class, args);
	}

}
