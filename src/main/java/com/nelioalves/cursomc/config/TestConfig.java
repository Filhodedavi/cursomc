package com.nelioalves.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nelioalves.cursomc.services.DBServices;

//criando uma configuracao de teste, dentro dela chamo a instanciacao que esta na classe 
//DBService que é responsavel por conhecer como devo instanciar um banco de dados de teste

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBServices dbservice;
	
	@Bean
	public boolean instantiateDatabase () throws ParseException {
		dbservice.instantiateTestDatabase();
		return true;
	}
}
