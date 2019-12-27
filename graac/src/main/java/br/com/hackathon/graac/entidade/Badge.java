package br.com.hackathon.graac.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BADGE")
public class Badge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_BADGE", nullable = false)
	private Long id;
		
	@Column(name = "DS_NOME", nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "FK_CATEGORIA", nullable = false)
	private Categoria categoria;
		
	@Column(name = "VL_XP_MIN", nullable = false)
	private Integer xpMin;

	@Column(name = "DS_NOME_ARQUIVO")
	private String nomeArquivo;

	public Badge() {
		super();
	}

	public Badge(String nome, Categoria categoria, Integer xpMin, String nomeArquivo) {

		super();
		this.nome = nome;
		this.categoria = categoria;
		this.xpMin = xpMin;
		this.nomeArquivo = nomeArquivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Integer getXpMin() {
		return xpMin;
	}

	public void setXpMin(Integer xpMin) {
		this.xpMin = xpMin;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
}
