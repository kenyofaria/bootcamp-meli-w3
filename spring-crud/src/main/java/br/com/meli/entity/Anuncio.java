package br.com.meli.entity;

import java.math.BigDecimal;

public class Anuncio {

	private Long id;
	private String codigo;
	private String titulo;
	private BigDecimal preco;
	private Integer quantidade;
	private Integer vendidos;
	private Vendedor vendedor;
	
	public Anuncio() {
		//auto generated
	}
	
	public Long getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Integer getVendidos() {
		return vendidos;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	//interfaces fluentes
	public Anuncio comId(Long id) {
		this.id = id;
		return this;
	}
	
	public Anuncio comCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public Anuncio comTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public Anuncio comPreco(BigDecimal preco) {
		this.preco = preco;
		return this;
	}
	
	public Anuncio comEstoqueDe(Integer estoque) {
		this.quantidade = estoque;
		return this;
	}
	
	public Anuncio comQuantidadeVendidaDe(Integer quantidadeVendida) {
		this.vendidos = quantidadeVendida;
		return this;
	}

	public Anuncio doVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
		return this;
	}
	
	public Anuncio build() {
		return this;
	}
	
	
}
