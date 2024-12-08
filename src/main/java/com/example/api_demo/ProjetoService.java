package com.example.api_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> buscarPorDescricao(String descricao) {
        return projetoRepository.findByDescricao(descricao);
    }
}
