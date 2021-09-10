package com.dh.meli.w3.oo.lesson7;

public class Venda {

	public Anuncio anuncio;
	public Integer quantidade;
	private int numero;
	
	public Venda(int numero, Anuncio anuncio, Integer quantidade) {
		super();
		this.numero = numero;
		this.anuncio = anuncio;
		this.quantidade = quantidade;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public int getNumero() {
		return numero;
	}
	
}
