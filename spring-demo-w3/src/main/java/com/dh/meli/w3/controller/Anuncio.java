package com.dh.meli.w3.controller;

public class Anuncio{
	
	private Integer relevancia; //de 0 a 5; onde 0 é pouco relevante e 5 é muito relevante
	private String titulo;
	private Double preco;
	
	public Anuncio(Integer relevancia, String titulo, Double preco) {
		super();
		this.relevancia = relevancia;
		this.titulo = titulo;
		this.preco = preco;
	}

	public Integer getRelevancia() {
		return relevancia;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return this.relevancia + "  " + this.titulo + "  " + this.getPreco();
	}

}
