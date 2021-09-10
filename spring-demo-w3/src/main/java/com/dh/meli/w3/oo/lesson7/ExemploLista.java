package com.dh.meli.w3.oo.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

	
	public static void main(String[] args) {
		
		List<Anuncio> lista = new ArrayList<Anuncio>();
		lista.add(new Anuncio("MLB98384938", "PS 5 PRO", "Produto recondicionado", 3000));
		Anuncio jbl = new Anuncio("MLB92819822", "fone jbl", "Produto novo. O melhor do Brasil", 300);
		lista.add(jbl);
		lista.add(new Anuncio("MLB123", "SSD 480 GB", "", 450));
		lista.add(new Anuncio("MLB456", "core I5 10a geracao", "", 600));
		
		System.out.println("-------------------- objeto -------------------");
		for(Anuncio item:lista) {
			System.out.println(item);
			
		}
	}
}
