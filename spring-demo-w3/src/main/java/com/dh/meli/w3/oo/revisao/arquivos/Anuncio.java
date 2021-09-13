package com.dh.meli.w3.oo.revisao.arquivos;

public class Anuncio{
	
	private Integer id;
	private Integer relevancia; //de 0 a 5; onde 0 é pouco relevante e 5 é muito relevante
	private String titulo;
	private Double preco;
	
	public Anuncio(Integer id, Integer relevancia, String titulo, Double preco) {
		super();
		this.id = id;
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

	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.relevancia + "  " + this.titulo + "  " + this.getPreco();
	}

}
