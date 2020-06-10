package com.igor.votoscooperativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.votoscooperativa.domain.Pauta;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Integer> {

}