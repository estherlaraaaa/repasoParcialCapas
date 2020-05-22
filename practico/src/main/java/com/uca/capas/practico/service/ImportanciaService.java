package com.uca.capas.practico.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.uca.capas.practico.domain.Importancia;

public interface ImportanciaService {
	
	public List<Importancia> findAll() throws DataAccessException;
	
	public Importancia findOne(Integer cimportancia) throws DataAccessException;

}
