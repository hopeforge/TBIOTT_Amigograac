package br.com.hackathon.graac.excecao;

import java.util.Date;

public class ErroDetalhe {
	
	private Date timestamp;
	private String mensagem;
	private String detalhe;

	public ErroDetalhe(Date timestamp, String mensagem, String detalhe) {
		super();
		this.timestamp = timestamp;
		this.mensagem = mensagem;
		this.detalhe = detalhe;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMensagem() {
		return mensagem;
	}
	
	public String getDetalhe() {
		return detalhe;
	}
}
