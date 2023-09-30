package com.gabriel.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.bookstore.domain.Categoria;
import com.gabriel.bookstore.domain.Livro;
import com.gabriel.bookstore.repositories.CategoriaRepository;
import com.gabriel.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		Categoria terror = new Categoria(null, "Terror", "Livro de Informatica");
		Categoria infantil = new Categoria(null, "Infantil", "Livros Infantis");

		Livro it = new Livro(null, "It", "Stephen King", "lorem ipsum", terror);
		Livro turmaDaMonica = new Livro(null, "Tuma da Monica", "Mauricio de Sousa", "lorem ipsum", infantil);

		terror.getLivros().addAll(Arrays.asList(it));
		infantil.getLivros().addAll(Arrays.asList(turmaDaMonica));

		this.categoriaRepository.saveAll(Arrays.asList(terror, infantil));
		this.livroRepository.saveAll(Arrays.asList(it, turmaDaMonica));
	}
}
