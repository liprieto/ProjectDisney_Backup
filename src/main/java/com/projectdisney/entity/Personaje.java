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
@Table(name="personaje")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Integer idPersonaje;
	
	@Column(name="Imagen")
	private String imagen;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Edad")
	private Integer edad;
	
	@Column(name="Peso")
	private Integer peso;
	
	@Column(name="Historia")
	private String historia;
	
	@ManyToOne
	@JoinColumn(name="idPeliserie")
	private PeliSerie peliserie;

	public Integer getIdPersonaje() {
		return idPersonaje;
	}

	public void setIdPersonaje(Integer idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public PeliSerie getPeliserie() {
		return peliserie;
	}

	public void setPeliserie(PeliSerie peliserie) {
		this.peliserie = peliserie;
	}
	
	

}
