package com.igor.votoscooperativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.votoscooperativa.domain.Associado;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, Integer> {

}