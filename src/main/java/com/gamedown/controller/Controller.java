package com.gamedown.controller;

import com.gamedown.jogo.dados.InserirJogo;
import com.gamedown.jogo.model.Jogo;
import com.gamedown.repository.JogoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogo")
public class Controller {

    @Autowired
    private JogoRepository repo;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid InserirJogo dados){
        repo.save(new Jogo(dados));

    }

}
