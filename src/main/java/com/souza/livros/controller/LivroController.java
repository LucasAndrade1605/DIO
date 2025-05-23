package com.souza.livros.controller;

import com.souza.livros.model.Livro;
import com.souza.livros.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

	@PostMapping
	public ResponseEntity<Livro> create(@RequestBody Livro livro){
		System.out.println("Resquest recebido: "+livro);
		return ResponseEntity.ok(livroService.create(livro));
	}

    @GetMapping
    public ResponseEntity<List<Livro>> findAll() {
        return ResponseEntity.ok(livroService.listAll());
    }
}
