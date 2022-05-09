package com.projectdisney.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectdisney.entity.Personaje;
import com.projectdisney.repository.IPersonajeRepository;
import com.projectdisney.service.IPersonajeService;

@Service
public class PersonajeImplement implements IPersonajeService{
	
	@Autowired
	IPersonajeRepository repo;

	@Override
	public List<Personaje> list() {
		return repo.findAll();
	}

	@Override
	public Personaje create(Personaje personaje) {
		return repo.save(personaje);
	}

	@Override
	public Personaje update(Personaje personaje) {
		return repo.save(personaje);
	}

	@Override
	public void delete(Integer code) {
		repo.deleteById(code);
	} 

	@Override
	public Personaje listId(Integer code) {
		return repo.findById(code).orElse(null);
	}
	
	

}
