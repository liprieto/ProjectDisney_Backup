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

import com.projectdisney.entity.Genero;
import com.projectdisney.service.IGeneroService;

@RestController
@RequestMapping("/genero")
public class GeneroController {
	
	@Autowired
	private IGeneroService service;
	
	@GetMapping
	public ResponseEntity<List<Genero>> list(){
		List<Genero> obj = service.list();
		return new ResponseEntity<List<Genero>>(obj, HttpStatus.OK);		
	}
	
	@PostMapping
	public ResponseEntity<Genero> create(@RequestBody Genero genero){
		Genero obj = service.create(genero);
		return new ResponseEntity<Genero>(obj, HttpStatus.OK);	
	}
	
	@PutMapping
	public ResponseEntity<Genero> update(@RequestBody Genero genero){
		Genero obj = service.update(genero);
		return new ResponseEntity<Genero>(obj, HttpStatus.OK);	
	}	
	
	@DeleteMapping("/id")
	public ResponseEntity<Void> delete (@PathVariable("{id}") Integer id) throws Exception{
		Genero obj = service.listId(id);
		if(obj == null) {
			throw new Exception("No hay registro");
		}
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/id")
	public ResponseEntity<Genero> listId(@PathVariable("{id}") Integer code) throws Exception{
		Genero obj = service.listId(code);
		if(obj == null) {
			throw new Exception("No hay registro");
		}
		return new ResponseEntity<Genero>(obj, HttpStatus.OK);
		
	}
}

