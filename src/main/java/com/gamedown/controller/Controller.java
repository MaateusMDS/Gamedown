package com.gamedown.controller;

import com.gamedown.jogo.dados.InserirJogo;
import com.gamedown.jogo.dados.ListarJogos;
import com.gamedown.jogo.model.Jogo;
import com.gamedown.repository.JogoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping
    public Page<ListarJogos> findAll(@PageableDefault(size = 3, sort = {"titulo"})Pageable pageable) {
        return repo.findAllByVisivelTrue(pageable).map(ListarJogos::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        var jogo = new Jogo();
        jogo = repo.getReferenceById(id);
        jogo.apagarJogo();
    }

}
