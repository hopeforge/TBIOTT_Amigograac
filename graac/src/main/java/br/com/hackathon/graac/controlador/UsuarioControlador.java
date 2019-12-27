package br.com.hackathon.graac.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathon.graac.entidade.Badge;
import br.com.hackathon.graac.entidade.Categoria;
import br.com.hackathon.graac.entidade.HistoricoPontuacao;
import br.com.hackathon.graac.entidade.Usuario;
import br.com.hackathon.graac.excecao.ResourceNotFoundException;
import br.com.hackathon.graac.servico.BadgeServico;
import br.com.hackathon.graac.servico.HistoricoPontuacaoServico;
import br.com.hackathon.graac.servico.UsuarioServico;

@CrossOrigin(origins = "${cors-origin}")
@RestController
@RequestMapping("/graac")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServico usuarioService;
	
	@Autowired
	private HistoricoPontuacaoServico historicoPontuacaoServico;
	
	@Autowired
	private BadgeServico badgeServico;
	
	@CrossOrigin(origins = "http://localhost:4200")

	@RequestMapping(value="/usuarios", method = RequestMethod.GET)
	public List<Usuario> obterTodosUsuario() {
		return usuarioService.findAll();
	}

	@GetMapping("/usuarios/{cpf}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable(value = "cpf") String cpf)
			throws ResourceNotFoundException {
		Usuario usuario = usuarioService.findByCpf(cpf);
		return ResponseEntity.ok().body(usuario);
	}
	
	@GetMapping("/perfil/badges/{id}")
	public List<Badge> getUserBadges(@PathVariable(value = "id") String id) {
		
		List<Badge> result = new ArrayList<>();
		
		List<HistoricoPontuacao> historicosUsuario = historicoPontuacaoServico.findAllByUsuarioId(Long.valueOf(id));
		
		Map<Categoria, List<HistoricoPontuacao>> mapaCategoriaXp = historicosUsuario.stream()
				.collect(Collectors.groupingBy((r) -> r.getCategoria()));
		
		for(Categoria categoria : mapaCategoriaXp.keySet()) {
			Integer sum = 0;
			
			for (HistoricoPontuacao historico : mapaCategoriaXp.get(categoria)) {
				sum += historico.getXp();
			}
			
			result.addAll(badgeServico.findByXpMinLessThanEqualAndCategoria(sum, categoria));
		}
		
		return result;
	}
}
