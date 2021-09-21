package br.com.meli.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.meli.entity.Anuncio;

//classe especializada em realizar persistencia de anuncios

public class AnuncioPersistence {

	private static List<Anuncio> anuncios = new ArrayList<>(); 
	
	
	public void cadastro(Anuncio anuncio) {
		anuncio.setId(anuncios.size()+1L);
		anuncios.add(anuncio);			
	}
	
	public List<Anuncio> listagem(){
		return anuncios;
	}
	 
}
