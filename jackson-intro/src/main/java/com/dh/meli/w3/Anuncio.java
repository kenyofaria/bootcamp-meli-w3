package com.dh.meli.w3;

import java.math.BigDecimal;

public class Anuncio {

	private String codigo;
	private String titulo;
	private BigDecimal preco;
	//private Vendedor vendedor;
	
	public Anuncio(String codigo, String titulo, BigDecimal preco) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public Anuncio() {
	}
	
//	public Anuncio(String codigo, String titulo, BigDecimal preco, Vendedor vendedor) {
//		super();
//		this.codigo = codigo;
//		this.titulo = titulo;
//		this.preco = preco;
//		this.vendedor = vendedor;
//	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
//	public Vendedor getVendedor() {
//		return vendedor;
//	}
	
	
}
