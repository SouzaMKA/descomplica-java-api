package com.example.api_demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @Operation(summary = "Buscar tarefas por status", description = "Esse endpoint retorna tarefas filtradas pelo status informado.")
    @GetMapping("/tarefas")
    public List<Tarefa> buscarPorStatus(
            @Parameter(description = "Status da tarefa para filtro", required = true) @RequestParam String status) {
        return tarefaService.buscarPorStatus(status);
    }
}
