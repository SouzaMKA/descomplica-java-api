package com.example.api_demo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Schema(description = "Modelo de um projeto")
public class Projeto {

    @Id
    @Schema(description = "ID do projeto", example = "1")
    private Long id;

    @Schema(description = "Descrição do projeto", example = "Projeto de Desenvolvimento de Software")
    private String descricao;

    public Projeto() {
    }

    public Projeto(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
