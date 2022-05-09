package com.projectdisney.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectdisney.entity.PeliSerie;
import com.projectdisney.repository.IPeliserieRepository;
import com.projectdisney.service.IPeliserieService;

@Service
public class PeliserieImplements implements IPeliserieService{
	
	@Autowired
	IPeliserieRepository repo;
	
	@Override
	public List<PeliSerie> list() {
		return repo.findAll();
	}

	@Override
	public PeliSerie create(PeliSerie peliserie) {
		return repo.save(peliserie);
	}

	@Override
	public PeliSerie update(PeliSerie peliserie) {
		return repo.save(peliserie);
	}

	@Override
	public void delete(Integer code) {
		repo.deleteById(code);
	}

	@Override
	public PeliSerie listId(Integer code) {
		return repo.findById(code).orElse(null);
	}

}
