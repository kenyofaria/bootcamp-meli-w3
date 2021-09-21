package br.com.meli.entity;

import java.math.BigDecimal;

public class Anuncio {

	private Long id;
	private String codigo;
	private String titulo;
	private BigDecimal preco;
	private Integer quantidade;
	private Integer vendidos;
	
	public Anuncio(Long id, String codigo, String titulo, BigDecimal preco, Integer quantidade, Integer vendidos) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.vendidos = vendidos;
	}
	
	

	public Anuncio(String codigo, String titulo, BigDecimal preco, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
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
}
