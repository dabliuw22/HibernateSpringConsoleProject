package com.unimagdalena.tallerh.repository.inter;

import java.util.List;

import com.unimagdalena.tallerh.entity.Pais;

public interface PaisRepository {
	
	public void save(Pais pais);
	
	public Pais findById(Integer id);
	
	public List<Pais> findAll();
	
	public void update(Pais pais);
	
	public void delete(Integer id);
}
