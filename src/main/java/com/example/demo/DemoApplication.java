package com.example.demo;

import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication  {

	public static Set<String> whitelist;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
