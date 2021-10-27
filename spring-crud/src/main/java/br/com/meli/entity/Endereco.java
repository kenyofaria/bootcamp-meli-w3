package br.com.meli.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String uf;
	private String cidade;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Endereco(String uf, String cidade) {
		super();
		this.uf = uf;
		this.cidade = cidade;
	}


	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	
	
	
}
