package com.souza.livros.services;

import com.souza.livros.model.Autor;
import com.souza.livros.model.Livro;
import com.souza.livros.repository.AutorRepository;
import com.souza.livros.repository.LivroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Slf4j
public class LivroService {
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository,AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

	public Livro create(Livro livro) {
	    if (livro.getId() != null && livroRepository.existsById(livro.getId())) {
	        throw new NoSuchElementException("O livro com ID: " + livro.getId() + " ja existe.");
	    }
	    if (livro.getAutor().getId() != null && !autorRepository.existsById(livro.getAutor().getId())) {
	        Autor autor = new Autor(livro.getAutor().getNome());
	    	autorRepository.save(autor);
	    }
	    return livroRepository.save(livro);
	}

    public List<Livro> listAll() {
        return livroRepository.findAll();
    }
}
