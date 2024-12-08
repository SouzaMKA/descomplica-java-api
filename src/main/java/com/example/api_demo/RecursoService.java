package com.example.api_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> buscarPorNome(String nome) {
        return recursoRepository.findByNome(nome);
    }
}
