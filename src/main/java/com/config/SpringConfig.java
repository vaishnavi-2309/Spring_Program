package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Calculator;

@Configuration
public class SpringConfig {
	
	@Bean
	public Calculator cal() {
		Calculator c=new Calculator();
		
		return c;
	}

}
