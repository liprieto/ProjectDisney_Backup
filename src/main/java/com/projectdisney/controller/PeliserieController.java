package com.projectdisney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projectdisney.entity.PeliSerie;
import com.projectdisney.service.IPeliserieService;

@RestController
@RequestMapping("/peliserie")
public class PeliserieController {
	
	@Autowired
	private IPeliserieService service;
	
	@GetMapping
	public ResponseEntity<List<PeliSerie>> list(){   
		List<PeliSerie> obj = service.list();
		return new ResponseEntity<List<PeliSerie>>(obj, HttpStatus.OK);		
	}
	
	@PostMapping
	public ResponseEntity<PeliSerie> create(@RequestBody PeliSerie peliserie){
		PeliSerie obj = service.create(peliserie);
		return new ResponseEntity<PeliSerie>(obj, HttpStatus.OK);	
	}
	
	@PutMapping
	public ResponseEntity<PeliSerie> update(@RequestBody PeliSerie peliserie){
		PeliSerie obj = service.update(peliserie);
		return new ResponseEntity<PeliSerie>(obj, HttpStatus.OK);	
	}	
	
	@DeleteMapping("/nombre")
	public ResponseEntity<Void> delete (@PathVariable("{nombre}") Integer id) throws Exception{
		PeliSerie obj = service.listId(id);
		if(obj == null) {
			throw new Exception("No hay registro");
 		}
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/nombre")
	public ResponseEntity<PeliSerie> listId(@PathVariable("{nombre}") Integer code) throws Exception{
		PeliSerie obj = service.listId(code);
		if(obj == null) {
			throw new Exception("No hay registro");
		}
		return new ResponseEntity<PeliSerie>(obj, HttpStatus.OK);
		
	}
}
