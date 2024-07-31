package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //@Configuration + @EnableAutoConfiguration +@ComponentScan
public class SpringDemo2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringDemo2Application.class, args);
	}

}
