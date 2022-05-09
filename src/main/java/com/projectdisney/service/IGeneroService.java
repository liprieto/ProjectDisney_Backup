package com.projectdisney.service;

import java.util.List;

import com.projectdisney.entity.Genero;

public interface IGeneroService {
	
	List<Genero> list();
	Genero create (Genero genero);
	Genero update (Genero genero);
	void delete (Integer code);
	Genero listId(Integer code);

}
