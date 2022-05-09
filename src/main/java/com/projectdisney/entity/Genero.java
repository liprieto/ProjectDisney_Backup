package com.projectdisney.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="genero")
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer idGenero;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Imagen")
	private String imagen;
	
	@ManyToOne
	@JoinColumn(name="idPeliserie")
	private PeliSerie peliserie;

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public PeliSerie getPeliserie() {
		return peliserie;
	}

	public void setPeliserie(PeliSerie peliserie) {
		this.peliserie = peliserie;
	}
	
	
	
	

}
