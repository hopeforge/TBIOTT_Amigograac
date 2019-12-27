package br.com.hackathon.graac.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathon.graac.entidade.HistoricoPontuacao;
import br.com.hackathon.graac.entidade.dto.DoacaoDTO;
import br.com.hackathon.graac.servico.HistoricoPontuacaoServico;

@CrossOrigin(origins = "${cors-origin}")
@RestController
@RequestMapping("/graac")
public class HistoricoPontuacaoControlador {

	@Autowired
	HistoricoPontuacaoServico historicoPontuacaoServico;
	
	@PostMapping("/pontuacao/insert")
	public ResponseEntity<HistoricoPontuacao> addPontuacao(@RequestBody DoacaoDTO doacao) {
		HistoricoPontuacao historicoPontuacao = historicoPontuacaoServico.save(doacao);
		
		return ResponseEntity.ok().body(historicoPontuacao);
	}
	
	@GetMapping("/pontuacao/face/{idUsuario}")
	public ResponseEntity<String> addPontuacao(@PathVariable(value = "idUsuario") String idUsuario) {
		return ResponseEntity.ok().body("{\"text\":\"" + historicoPontuacaoServico.obterFace(Long.parseLong(idUsuario)) + "\" }");
	}
}
