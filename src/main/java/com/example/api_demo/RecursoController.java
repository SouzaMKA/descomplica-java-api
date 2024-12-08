package com.example.api_demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @Operation(summary = "Buscar recursos por nome", description = "Esse endpoint retorna recursos filtrados pelo nome informado.")
    @GetMapping("/recursos")
    public List<Recurso> buscarPorNome(
            @Parameter(description = "Nome do recurso para filtro", required = true) @RequestParam String nome) {
        return recursoService.buscarPorNome(nome);
    }
}
