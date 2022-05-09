package com.projectdisney.service;

import java.util.List;

import com.projectdisney.entity.PeliSerie;

public interface IPeliserieService {
	
	List<PeliSerie> list();
	PeliSerie create (PeliSerie peliserie);
	PeliSerie update (PeliSerie peliserie);
	void delete (Integer code);
	PeliSerie listId(Integer code);

}
