package com.allgames.allgamesapi.repository;

import com.allgames.allgamesapi.domain.Tamaño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Tamaño,Integer> {

}
