package com.souza.livros.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.lang.Nullable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "autores")
public class Autor {

	public Autor(String nome) {
		this.nome = nome;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(nullable = false, length = 100)
	private String nome;

//    @Nullable
//    @OneToMany(mappedBy = "autor")
//	private List<Livro> livros;
//	
}
