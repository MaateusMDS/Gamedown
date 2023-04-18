package com.gamedown.controller;

import com.gamedown.jogo.dados.InserirJogo;
import com.gamedown.jogo.model.Jogo;
import com.gamedown.repository.JogoRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    private JogoRepository repo;

    @GetMapping
    public void save(@RequestBody @Valid InserirJogo dados){
        repo.save(new Jogo(dados));

    }

}
