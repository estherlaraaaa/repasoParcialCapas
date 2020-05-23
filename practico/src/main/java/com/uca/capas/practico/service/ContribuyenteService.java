package com.uca.capas.practico.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.uca.capas.practico.domain.Contribuyente;

public interface ContribuyenteService {
	
	public List<Contribuyente> findAll() throws DataAccessException;
	
	public void save(Contribuyente contribuyente) throws DataAccessException;
}
