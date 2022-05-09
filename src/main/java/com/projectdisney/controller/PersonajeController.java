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
import com.projectdisney.entity.Personaje;
import com.projectdisney.service.IPersonajeService;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {
	
	@Autowired
	IPersonajeService service;
	
	@GetMapping
	public ResponseEntity<List<Personaje>> list(){   
		List<Personaje> obj = service.list();
		return new ResponseEntity<List<Personaje>>(obj, HttpStatus.OK);		
	}
	
	@PostMapping
	public ResponseEntity<Personaje> create(@RequestBody Personaje personaje){
		Personaje obj = service.create(personaje);
		return new ResponseEntity<Personaje>(obj, HttpStatus.OK);	
	}
	
	@PutMapping
	public ResponseEntity<Personaje> update(@RequestBody Personaje personaje){
		Personaje obj = service.update(personaje);
		return new ResponseEntity<Personaje>(obj, HttpStatus.OK);	
	}	
	
	@DeleteMapping("/nombre")
	public ResponseEntity<Void> delete (@PathVariable("{nombre}") Integer id) throws Exception{
		Personaje obj = service.listId(id);
		if(obj == null) {
			throw new Exception("No hay registro");
 		}
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/nombre")
	public ResponseEntity<Personaje> listId(@PathVariable("{nombre}") Integer code) throws Exception{
		Personaje obj = service.listId(code);
		if(obj == null) {
			throw new Exception("No hay registro");
		}
		return new ResponseEntity<Personaje>(obj, HttpStatus.OK);
		
	}
		
	

}
