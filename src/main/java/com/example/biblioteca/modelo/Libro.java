package com.example.biblioteca.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String libros;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "registro")
	private String registro;
	
	public Libro() {
		
	}
	
	public Libro (Long id, String libros, String name, String registro) {
		this.id = id;
		this.libros = libros;
		this.name = name;
		this.registro = registro;
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLibros() {
		return libros;
	}
	
	public void setLibros (String libros) {
		this.libros = libros;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getRegistro() {
		return registro;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return "Libro [id="+ id + ", name=" + name + ", registro=" + registro +"]";
		
	}

}
