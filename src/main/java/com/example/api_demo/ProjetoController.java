package com.example.api_demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @Operation(summary = "Buscar projetos por descrição", description = "Esse endpoint retorna uma lista de projetos filtrados pela descrição informada.")
    @GetMapping("/projetos")
    public List<Projeto> buscarPorDescricao(
            @Parameter(description = "Descrição do projeto para filtro", required = true) @RequestParam String descricao) {
        return projetoService.buscarPorDescricao(descricao);
    }
}
