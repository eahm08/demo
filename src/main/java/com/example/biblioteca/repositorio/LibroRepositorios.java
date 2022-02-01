package com.example.biblioteca.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.biblioteca.modelo.Libro;

@Repository
public interface LibroRepositorios extends JpaRepository<Libro, Long>{
	
	List<Libro> findByName(@Param("name") String name);

	List<Libro> findAll();

}
