/*
Mateus Mendes - RM95138
Eduardo Kenji - RM94180
 */

package com.gamedown.repository;

import com.gamedown.jogo.model.Jogo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {
    Page<Jogo> findAllByVisivelTrue(Pageable pageable);
}
