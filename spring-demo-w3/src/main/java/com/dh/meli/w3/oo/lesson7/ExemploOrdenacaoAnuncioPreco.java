package com.dh.meli.w3.oo.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoAnuncioPreco {
	public static void main(String[] args) {
		List<Anuncio> lista = new ArrayList<Anuncio>();
		lista.add(new Anuncio("MLB123", "PS 5 PRO", "Produto recondicionado", 3000));
		lista.add(new Anuncio("MLB456", "fone jbl", "Produto novo. O melhor do Brasil", 300));
		lista.add(new Anuncio("MLB789", "SSD 480 GB", "", 450));
		lista.add(new Anuncio("MLB019", "core I5 10a geracao", "", 600));
		lista.add(new Anuncio("MLB020", "01", "", 1));
		lista.add(new Anuncio("MLB021", "11", "", 11));
		lista.add(new Anuncio("MLB022", "02", "", 2));
	
		System.out.println("\n\n------- lista original ---------------");
		for (Anuncio s : lista) {
			System.out.println(s);
		}
		
		System.out.println("\n\n------- lista ordenada pelo critério padrão ---------------");
		Collections.sort(lista);
		for (Anuncio s : lista) {
			System.out.println(s);
		}
		
		System.out.println("\n\n------- lista ordenada pelo critério título ---------------");
		Collections.sort(lista, new Comparator<Anuncio>() {
			@Override
			public int compare(Anuncio o1, Anuncio o2) {
				//-1, caso o1 seja menor que o2
				// 0, caso o1 seja igual a o2
				// 1, caso o1 seja maior que o2
				return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
			}
		});
		
		for (Anuncio s : lista) {
			System.out.println(s);
		}
	}
}
