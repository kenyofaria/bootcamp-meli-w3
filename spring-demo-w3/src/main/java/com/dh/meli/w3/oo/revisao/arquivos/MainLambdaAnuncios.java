package com.dh.meli.w3.oo.revisao.arquivos;

import java.util.Arrays;
import java.util.List;

public class MainLambdaAnuncios {

	public static void main(String[] args) {

//		List<Anuncio> lista = Arrays.asList(new Anuncio(1, 5, "ps 5", 4000.00),
//											new Anuncio(2, 5, "ps 5", 4000.30),
//											new Anuncio(3, 5, "ps 5", 4200.00),
//											new Anuncio(4, 4, "ps 5", 3000.20),
//											new Anuncio(5, 0, "ps 5", 900.09),
//											new Anuncio(6, 1, "ps 5", 1800.00),
//											new Anuncio(7, 3, "ps 5", 4000.00),
//											new Anuncio(8, 2, "ps 5", 3000.00),
//											new Anuncio(9, 1, "ps 5", 2000.00));
		
		AnuncioDAO anuncioDAO = new AnuncioDAO("anuncios.txt");
//		anuncioDAO.salva(lista);
		
		List<Anuncio> anunciosCadastrados = anuncioDAO.listagem();
		anunciosCadastrados.forEach(System.out::println);
		
	}
}
