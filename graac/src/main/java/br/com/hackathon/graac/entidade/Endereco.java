package br.com.hackathon.graac.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ENDERECO")
	private Long id;
		
	@Column(name = "NU_CEP")
	private String cep;
	
	@Column(name = "DS_RUA")
	private String rua;
		
	@Column(name = "DS_BAIRRO")
	private String bairro;
	
	@Column(name = "NU_NUMERO")
	private String numero;

	@Column(name = "DS_CIDADE")
	private String cidade;
	
	@Column(name = "DS_ESTADO")
	private String estado;
	
	@Column(name = "DS_COMPLEMENTO")
	private String complemento;
		
	public Endereco() {
		super();
	}

	public Endereco(String cep, String rua, String bairro, String numero, String cidade, String estado,
			String complemento) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
		
}
