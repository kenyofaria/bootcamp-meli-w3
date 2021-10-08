package br.com.meli.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "vendedor_codigo")
	private Vendedor vendedor;
	
	private String cep;
	private String logradouro;
	private String complemento;
	private int numero;
	private String uf;
	private String cidade;
	
	public Endereco() {
		
	}

	public Endereco(Long id, String cep, String logradouro, String complemento, int numero, String uf, String cidade, Vendedor vendedor) {
		super();
		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.uf = uf;
		this.cidade = cidade;
		this.vendedor = vendedor;
	}

	public Endereco(String cep, String logradouro, String complemento, int numero, String uf, String cidade, Vendedor vendedor) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.uf = uf;
		this.cidade = cidade;
		this.vendedor = vendedor;
	}

	public Endereco(Long id, String cep, String logradouro, String complemento, int numero, String uf, String cidade) {
		super();
		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.uf = uf;
		this.cidade = cidade;
	}

	public Endereco(String cep, String logradouro, String complemento, int numero, String uf, String cidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.uf = uf;
		this.cidade = cidade;
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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}
