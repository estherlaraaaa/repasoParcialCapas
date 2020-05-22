package com.uca.capas.practico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.practico.dao.ImportanciaDAO;
import com.uca.capas.practico.domain.Importancia;

@Service
public class ImportanciaServiceImpl implements ImportanciaService {
	
	@Autowired
	ImportanciaDAO importanciaDAO;

	@Override
	public List<Importancia> findAll() throws DataAccessException {
		return importanciaDAO.findAll();
	}

	@Override
	public Importancia findOne(Integer cimportancia) throws DataAccessException {
		return importanciaDAO.findOne(cimportancia);
	}

}