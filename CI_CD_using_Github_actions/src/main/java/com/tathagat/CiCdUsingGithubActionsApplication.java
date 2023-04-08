package com.tathagat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdUsingGithubActionsApplication {

	
	@GetMapping(value="/page")
	public String getString()
	{
		return "HERE is CI/CD workflow";
	}
	public static void main(String[] args) {
		SpringApplication.run(CiCdUsingGithubActionsApplication.class, args);
	}

}
