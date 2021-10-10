package com.LojasKlm.confg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.LojasKlm.service.DBService;

@Configuration
@Profile("test")
public class TesteConfg {
	
	

	@Autowired
	private DBService dbService;
	
	@Bean
	public void instaciaBaseDeDados() {
		this.dbService.InstanciaBaseDeDado();
		}
	
}
