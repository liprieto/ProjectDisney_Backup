package com.projectdisney.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectdisney.entity.Genero;
import com.projectdisney.repository.IGeneroRepository;
import com.projectdisney.service.IGeneroService;

@Service
public class GeneroImplements implements IGeneroService{
	
	@Autowired
	IGeneroRepository repo;
	
	@Override
	public List<Genero> list() {
		return repo.findAll();
	}

	@Override
	public Genero create(Genero genero) {
		return repo.save(genero);
	}

	@Override
	public Genero update(Genero genero) {
		return repo.save(genero);
	}

	@Override
	public void delete(Integer code) {
		repo.deleteById(code);
	}

	@Override
	public Genero listId(Integer code) {
		return repo.findById(code).orElse(null);
	}

}
