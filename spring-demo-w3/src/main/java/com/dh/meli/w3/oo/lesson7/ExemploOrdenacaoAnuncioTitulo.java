package com.dh.meli.w3.oo.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoAnuncioTitulo {
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
		AnuncioTituloComparator comparatorPorTitulo = new AnuncioTituloComparator();
		Collections.sort(lista, comparatorPorTitulo);
		
		for (Anuncio s : lista) {
			System.out.println(s);
		}
	}

}
class AnuncioTituloComparator implements Comparator<Anuncio>{

	@Override
	public int compare(Anuncio o1, Anuncio o2) {
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
	}
	
}
