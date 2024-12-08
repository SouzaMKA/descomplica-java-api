package com.example.api_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(ProjetoRepository projetoRepository) {
		return args -> {
			if (projetoRepository.count() == 0) {
				Projeto projeto1 = new Projeto(1L, "Projeto de Desenvolvimento");
				Projeto projeto2 = new Projeto(2L, "Projeto de Testes");
				projetoRepository.save(projeto1);
				projetoRepository.save(projeto2);
				System.out.println("Dados de projeto inseridos!");
			}
		};
	}
}
