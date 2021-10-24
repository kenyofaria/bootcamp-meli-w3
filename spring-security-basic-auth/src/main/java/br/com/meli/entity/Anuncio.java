package br.com.meli.entity;

import java.math.BigDecimal;

public class Anuncio {

	private String codigo;
	private String titulo;
	private BigDecimal preco;
	
	public Anuncio(String codigo, String titulo, BigDecimal preco) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
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
	
}
