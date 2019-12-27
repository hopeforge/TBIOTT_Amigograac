package br.com.hackathon.graac.repositorio;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hackathon.graac.entidade.Categoria;
import br.com.hackathon.graac.entidade.HistoricoPontuacao;

@Repository
public interface HistoricoPontuacaoRepository extends JpaRepository<HistoricoPontuacao, Long> {

	public List<HistoricoPontuacao> findAllHistoricoPontuacaoByCategoria(Categoria categoria);
	
	public List<HistoricoPontuacao> findAllByUsuarioId(Long id);
	
	public List<HistoricoPontuacao> findByUsuarioIdAndTransacaoAfter(Long id, LocalDateTime data);
}
