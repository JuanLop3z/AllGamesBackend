package com.allgames.allgamesapi.repository;

import com.allgames.allgamesapi.domain.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegosRepository extends JpaRepository<Juegos,Integer> {
}
