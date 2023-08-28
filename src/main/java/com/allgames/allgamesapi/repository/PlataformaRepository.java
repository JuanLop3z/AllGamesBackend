package com.allgames.allgamesapi.repository;

import com.allgames.allgamesapi.domain.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma,Integer> {
}
