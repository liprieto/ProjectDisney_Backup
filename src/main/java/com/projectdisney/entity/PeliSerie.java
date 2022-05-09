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
@Table(name="peliserie") 
public class PeliSerie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id", nullable = false)
	private Integer idPeliserie;
	
	@Column(name="Imagen")
	private String imagen;
	
	@Column(name="Titulo")
	private String titulo;
	
	@Column(name="Estreno")
	private String estreno;
		
	@Column(name="Calificacion")
	private Integer calificacion;
	
	@ManyToOne
	@JoinColumn(name="idPersonaje")
	private Personaje personaje;

	public Integer getIdPeliserie() {
		return idPeliserie;
	}

	public void setIdPeliserie(Integer idPeliserie) {
		this.idPeliserie = idPeliserie;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstreno() {
		return estreno;
	}

	public void setEstreno(String estreno) {
		this.estreno = estreno;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	
	
}
