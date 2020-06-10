package com.igor.votoscooperativa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igor.votoscooperativa.domain.Associado;
import com.igor.votoscooperativa.services.AssociadoService;

@RestController
@RequestMapping(value = "/associados")
public class AssociadoResource {

	@Autowired
	private AssociadoService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Associado obj = service.find(id);
		return ResponseEntity.ok().body(obj);

	}
}