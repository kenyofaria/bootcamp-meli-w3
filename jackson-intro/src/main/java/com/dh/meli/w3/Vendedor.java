package com.dh.meli.w3;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

	private String codigo;
	private String nome;
	private List<Anuncio> anuncios = new ArrayList<Anuncio>();
	
	public Vendedor(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Vendedor() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Anuncio> getAnuncios() {
		return anuncios;
	}
	
	public void adicionaAnuncio(Anuncio anuncio) {
		this.anuncios.add(anuncio);
	}
	
	public void setAnuncios(List<Anuncio> anuncios) {
		this.anuncios = anuncios;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
