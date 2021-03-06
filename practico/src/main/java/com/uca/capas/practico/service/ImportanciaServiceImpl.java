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
	ImportanciaDAO importanciaDao;
	
	@Override
	public List<Importancia> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return importanciaDao.findAll();
	}

	@Override
	public Importancia findOne(Integer c_importancia) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}