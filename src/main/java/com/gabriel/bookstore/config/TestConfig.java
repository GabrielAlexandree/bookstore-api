package com.gabriel.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabriel.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean //pra ele identificar que esse metodo suba quando o perfil de teste estiver ativo
	public void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados();
	}
}
