package com.projectdisney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectdisney.entity.Personaje;

public interface IPersonajeRepository extends JpaRepository<Personaje, Integer>{
	

}
