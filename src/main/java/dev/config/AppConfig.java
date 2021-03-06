package dev.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@ComponentScan({"dev"})
@EnableJpaRepositories("dev.repository")

public class AppConfig {

	@Bean
	public Scanner scanner(){
		
		return new Scanner(System.in);
			
	}
	
	
	
}
