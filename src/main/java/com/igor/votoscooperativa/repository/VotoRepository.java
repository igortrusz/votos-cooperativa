package com.igor.votoscooperativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.votoscooperativa.domain.Voto;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Integer> {

}