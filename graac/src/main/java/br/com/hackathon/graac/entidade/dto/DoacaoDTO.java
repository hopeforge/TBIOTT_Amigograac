package br.com.hackathon.graac.entidade.dto;

public class DoacaoDTO {

	private long idUsuario;
    private long idCategoria;
    private String valorDoacao;
    private Integer valorXP;
    
    
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getValorDoacao() {
		return valorDoacao;
	}
	public void setValorDoacao(String valorDoacao) {
		this.valorDoacao = valorDoacao;
	}
	public Integer getValorXP() {
		return valorXP;
	}
	public void setValorXP(Integer valorXP) {
		this.valorXP = valorXP;
	}
	public DoacaoDTO(long idUsuario, long idCategoria,  String valorDoacao, Integer valorXP) {
		super();
		this.idUsuario = idUsuario;
		this.idCategoria = idCategoria;
		this.valorDoacao = valorDoacao;
		this.valorXP = valorXP;
	}
    
    
}
