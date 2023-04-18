package com.gamedown.repository;

import com.gamedown.jogo.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
