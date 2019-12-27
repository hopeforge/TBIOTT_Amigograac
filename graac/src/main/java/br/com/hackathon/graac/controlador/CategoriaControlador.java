package br.com.hackathon.graac.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathon.graac.entidade.Categoria;
import br.com.hackathon.graac.servico.CategoriaServico;

@RestController
@CrossOrigin(origins = "${cors-origin}")
@RequestMapping("/graac")
public class CategoriaControlador {

	@Autowired
	private CategoriaServico categoriaService;
	
	@RequestMapping(value="/categorias", method = RequestMethod.GET)
	public List<Categoria> obterTodasCategorias() {
		return categoriaService.getAllCategorias();
	}
}
