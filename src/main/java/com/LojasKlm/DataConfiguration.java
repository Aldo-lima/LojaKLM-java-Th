package com.LojasKlm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfiguration {
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

}
