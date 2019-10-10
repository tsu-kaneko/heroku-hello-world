package com.example.herokuhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokuHelloWorldApplication {

       	@RequestMapping("/")
	public String home() {
		return "Hello World in Heroku";
	}

	public static void main(String[] args) {
		SpringApplication.run(HerokuHelloWorldApplication.class, args);
	}

}
