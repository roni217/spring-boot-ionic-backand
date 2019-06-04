package br.nom.rakio.prjmc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.nom.rakio.prjmc.services.DBService;
import br.nom.rakio.prjmc.services.EmailService;
import br.nom.rakio.prjmc.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instanciateDatabase() throws ParseException {
		
		dbService.instanciateTesteDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}