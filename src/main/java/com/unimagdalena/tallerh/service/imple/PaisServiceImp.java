package com.unimagdalena.tallerh.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unimagdalena.tallerh.entity.Pais;
import com.unimagdalena.tallerh.repository.inter.PaisRepository;
import com.unimagdalena.tallerh.service.inter.PaisService;

@Service("paisService") @Transactional
public class PaisServiceImp implements PaisService {
	
	@Autowired @Qualifier("paisRepository")
	private PaisRepository paisRepository;
	
	@Override
	@Transactional
	public void save(Pais pais) {
		paisRepository.save(pais);
	}

	@Override
	@Transactional(readOnly = true)
	public Pais findById(Integer id) {
		return paisRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

	@Override
	@Transactional
	public void update(Pais pais) {
		paisRepository.update(pais);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		paisRepository.delete(id);
	}
}
