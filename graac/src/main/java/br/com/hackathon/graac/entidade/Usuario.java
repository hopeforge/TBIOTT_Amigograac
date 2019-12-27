package br.com.hackathon.graac.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_USUARIO")
	private Long id;

	@Column(name = "DS_NOME")
	private String nome;
	
	@Column(name = "DS_EMAIL")
	private String email;
	
	@Column(name = "DOC_IDENTIFICACAO")
	private String docIdentificacao;
	
	@Column(name = "DS_USERNAME", unique = true)
	private String username;
	
	@Column(name = "DS_PASSWORD")
	private String password;

	@Column(name = "DT_NASCIMENTO")
	private Date nascimento;
	
	@Column(name = "DT_CADASTRO")
	private Date cadastro;
	
	@Column(name = "NU_TELEFONE", unique = true)
	private String telefone;

	@Column(name = "NU_CELULAR", unique = true)
	private String celular;
	
	@Column(name = "FL_SEXO")
	private String sexo;
	
	@ManyToOne
	@JoinColumn(name = "FK_ENDERECO")
	private Endereco endereco;
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String email, String docIdentificacao, String username, String password,
			Date nascimento, Date cadastro, String telefone, String celular, String sexo,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.docIdentificacao = docIdentificacao;
		this.username = username;
		this.password = password;
		this.nascimento = nascimento;
		this.cadastro = cadastro;
		this.telefone = telefone;
		this.celular = celular;
		this.sexo = sexo;
		this.endereco = endereco;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocIdentificacao() {
		return docIdentificacao;
	}

	public void setDocIdentificacao(String docIdentificacao) {
		this.docIdentificacao = docIdentificacao;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
