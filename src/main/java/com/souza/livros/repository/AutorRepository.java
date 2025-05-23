package com.souza.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souza.livros.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}
