package com.algaworks.curso.jpa2.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.algaworks.curso.jpa2.modelo.Fabricante;

public class FabricanteDAO implements Serializable {

	@Inject
	EntityManager entityManager;
	
	public void salvar(Fabricante fabricante) {
		
	}
}
