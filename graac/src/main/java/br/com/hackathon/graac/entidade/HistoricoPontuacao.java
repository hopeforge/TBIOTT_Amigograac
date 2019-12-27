package br.com.hackathon.graac.entidade;


import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TB_HISTORICO_PONTUACAO")
public class HistoricoPontuacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_HISTORICO", nullable = false)
	private Long id;
		
	@Column(name = "VL_XP", nullable = false)
	private Integer xp;
	
	@Column(name = "VL_DOACAO", nullable = false)
	private String doacao;
		
	@Column(name = "DT_TRANSACAO", nullable = false)
	private LocalDateTime transacao;
	
	@ManyToOne
	@JoinColumn(name = "FK_USUARIO", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "FK_CATEGORIA", nullable = false)
	private Categoria categoria;

	public HistoricoPontuacao() {
		super();
	}

	public HistoricoPontuacao(Integer xp, String doacao, LocalDateTime transacao, Usuario usuario, Categoria categoria) {
		super();
		this.xp = xp;
		this.doacao = doacao;
		this.transacao = transacao;
		this.usuario = usuario;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public String getDoacao() {
		return doacao;
	}

	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}

	public LocalDateTime getTransacao() {
		return transacao;
	}

	public void setTransacao(LocalDateTime transacao) {
		this.transacao = transacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
