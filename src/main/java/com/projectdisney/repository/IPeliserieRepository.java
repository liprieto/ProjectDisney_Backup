package com.projectdisney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectdisney.entity.PeliSerie;

public interface IPeliserieRepository extends JpaRepository<PeliSerie, Integer>{
	
	
}
