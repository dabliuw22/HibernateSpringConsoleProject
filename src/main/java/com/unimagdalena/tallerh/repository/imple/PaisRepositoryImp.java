package com.unimagdalena.tallerh.repository.imple;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unimagdalena.tallerh.entity.Pais;
import com.unimagdalena.tallerh.repository.inter.PaisRepository;

@Repository("paisRepository")
public class PaisRepositoryImp implements PaisRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Pais pais) {
		sessionFactory.getCurrentSession().saveOrUpdate(pais);
	}
	
	@Override
	public Pais findById(Integer id) {
		return (Pais) sessionFactory.getCurrentSession().get(Pais.class, id);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Pais> findAll() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Pais.class).list();
	}
	
	@Override
	public void update(Pais pais) {
		sessionFactory.getCurrentSession().update(pais);
	}
	
	@Override
	public void delete(Integer id) {
		Pais pais = findById(id);
		if(pais != null) {
			sessionFactory.getCurrentSession().delete(pais);
		}
	}
}
