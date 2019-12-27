package br.com.hackathon.graac.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.graac.entidade.Categoria;
import br.com.hackathon.graac.repositorio.CategoriaRepository;

@Service
public class CategoriaServico {


	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAllCategorias() {
		return categoriaRepository.findAll();
	}

	public Categoria findById(long idCategoria) {
		
		return categoriaRepository.findById(idCategoria).get();
	}
	
}
