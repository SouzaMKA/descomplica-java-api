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
	CommandLineRunner initData(RecursoRepository recursoRepository, TarefaRepository tarefaRepository,
			ProjetoRepository projetoRepository) {
		return args -> {
			if (recursoRepository.count() == 0) {
				Recurso recurso1 = new Recurso(1L, "Recurso A");
				Recurso recurso2 = new Recurso(2L, "Recurso B");
				recursoRepository.save(recurso1);
				recursoRepository.save(recurso2);
				System.out.println("Dados de recursos inseridos!");
			}

			if (tarefaRepository.count() == 0) {
				Tarefa tarefa1 = new Tarefa(1L, "Tarefa 1", "Em andamento");
				Tarefa tarefa2 = new Tarefa(2L, "Tarefa 2", "Completa");
				tarefaRepository.save(tarefa1);
				tarefaRepository.save(tarefa2);
				System.out.println("Dados de tarefas inseridos!");
			}
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
