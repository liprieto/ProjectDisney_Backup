package com.projectdisney.service;

import java.util.List;

import com.projectdisney.entity.Personaje;

public interface IPersonajeService {
	
	List<Personaje> list();
	Personaje create (Personaje personaje);
	Personaje update (Personaje personaje);
	void delete (Integer code);
	Personaje listId(Integer code);
	
	

}
