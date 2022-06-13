package com.example.loginexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Controller
public class LoginexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginexampleApplication.class, args);
	}

}
