package com.allgames.allgamesapi.repository;

import com.allgames.allgamesapi.domain.Formato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormatoRepository extends JpaRepository<Formato,Integer> {
}
