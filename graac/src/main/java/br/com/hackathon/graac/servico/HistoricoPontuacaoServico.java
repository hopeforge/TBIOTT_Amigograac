package br.com.hackathon.graac.servico;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathon.graac.entidade.Categoria;
import br.com.hackathon.graac.entidade.HistoricoPontuacao;
import br.com.hackathon.graac.entidade.Usuario;
import br.com.hackathon.graac.entidade.dto.DoacaoDTO;
import br.com.hackathon.graac.repositorio.HistoricoPontuacaoRepository;

@Service
public class HistoricoPontuacaoServico {
	
	@Autowired
	private HistoricoPontuacaoRepository historicoPontuacaoRepository;
	
	@Autowired
	private UsuarioServico usuarioServico;
	
	@Autowired
	private CategoriaServico categoriaServico;

	public HistoricoPontuacao save(DoacaoDTO doacao) {
		
		Usuario usuario = usuarioServico.findById(doacao.getIdUsuario());
		Categoria categoria = categoriaServico.findById(doacao.getIdCategoria());
		HistoricoPontuacao historicoPontuacao = new HistoricoPontuacao(doacao.getValorXP(), doacao.getValorDoacao(), LocalDateTime.now(), usuario, categoria);
		
		return historicoPontuacaoRepository.save(historicoPontuacao);
	}

	public List<HistoricoPontuacao> findAllByUsuarioId(Long id) {
		return this.historicoPontuacaoRepository.findAllByUsuarioId(id);
	}
	
	public String obterFace(Long idUsuario) {
		
		LocalDateTime dataAtual = LocalDateTime.now().minus(30L, ChronoUnit.DAYS);
		int qtdDoacao = historicoPontuacaoRepository.findByUsuarioIdAndTransacaoAfter(idUsuario, dataAtual).size();
		
		if(qtdDoacao>1) {
			return "char_mt_feliz.png";
		}else if(qtdDoacao == 1) {
			return "char_feliz.png";
		}
		return "char_triste.png";
	}
}
