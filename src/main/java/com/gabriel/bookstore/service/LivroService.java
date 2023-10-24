package com.gabriel.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.bookstore.domain.Livro;
import com.gabriel.bookstore.repositories.LivroRepository;
import com.gabriel.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;//faz a comunicacao com a base de dados  vai iniciar mostrar e destruir essa instancia 

	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado! ID : "  + id + ", Tipo: " + Livro.class.getName()));
	}
	
}
