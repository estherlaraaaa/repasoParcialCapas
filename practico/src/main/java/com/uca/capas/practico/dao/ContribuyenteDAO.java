package com.uca.capas.practico.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.uca.capas.practico.domain.Contribuyente;

public interface ContribuyenteDAO {
	
	public List<Contribuyente> findAll() throws DataAccessException;
	
	public void save(Contribuyente c) throws DataAccessException;

}
