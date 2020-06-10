package com.igor.votoscooperativa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.votoscooperativa.domain.Associado;
import com.igor.votoscooperativa.repository.AssociadoRepository;

@Service
public class AssociadoService {

	@Autowired
	private AssociadoRepository repo;

	public Associado find(Integer id) {
		Optional<Associado> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
