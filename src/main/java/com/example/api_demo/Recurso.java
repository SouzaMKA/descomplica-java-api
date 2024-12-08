package com.example.api_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recurso {

    @Id
    private Long id;
    private String nome;

    public Recurso() {
    }

    public Recurso(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
