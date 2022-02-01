package com.example.biblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.modelo.Libro;
import com.example.biblioteca.repositorio.LibroRepositorios;

@RestController
@RequestMapping("/api")
public class LibroControlador {
	
	@Autowired
	private LibroRepositorios repositorios;
	
	@GetMapping("/libros")
	public List<Libro> allLibros(){
		return repositorios.findAll();
	}
	
	@GetMapping("/libro/{name}")
	public List<Libro> findByName(@PathVariable("name") String name){
		return repositorios.findByName(name);
			
	}
	
	@PostMapping("/libro")
	public Libro createLibro(@RequestBody Libro libro) {
		return repositorios.save(libro);
	}
	
	@PutMapping("/libro/{id}")
	public Libro updateLibro(@PathVariable int id,@RequestBody Libro libro) {
		return repositorios.save(libro);
	}
	
	@DeleteMapping("/libro/{id}")
	public void deleteLibro(@PathVariable("id") Long id) {
		repositorios.deleteById(id);
	}

}
