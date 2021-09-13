package com.dh.meli.w3.oo.lesson9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainLambdaAnuncios {

	public static void main(String[] args) {

		List<Anuncio> lista = Arrays.asList(new Anuncio(5, "ps 5", 4000.00),
											new Anuncio(5, "ps 5", 4000.30),
											new Anuncio(5, "ps 5", 4200.00),
											new Anuncio(4, "ps 5", 3000.20),
											new Anuncio(0, "ps 5", 900.09),
											new Anuncio(1, "ps 5", 1800.00),
											new Anuncio(3, "ps 5", 4000.00),
											new Anuncio(2, "ps 5", 3000.00),
											new Anuncio(1, "ps 5", 2000.00));
		
		
		System.out.println("------ ordenacao por lista.sort lambda crescente de relevancia ------");
		lista.sort((Anuncio a1, Anuncio a2) -> a1.getRelevancia().compareTo(a2.getRelevancia()));
		lista.forEach(System.out::println);
		
		System.out.println("------ ordenacao por lista.sort lambda crescente de relevancia ------");
		lista.sort((Anuncio a1, Anuncio a2) -> a2.getRelevancia().compareTo(a1.getRelevancia()));
		lista.forEach(System.out::println);

		System.out.println("------ ordenacao por lista.sort lambda crescente de preco ------");
		lista.sort((Anuncio a1, Anuncio a2) -> a1.getPreco().compareTo(a2.getPreco())); //lambda functions
		lista.forEach(System.out::println);
		
		System.out.println("------ ordenacao por lista.sort lambda decrescente de preco ------");
		lista.sort((Anuncio a1, Anuncio a2) -> a2.getPreco().compareTo(a1.getPreco())); //lambda functions
		lista.forEach(System.out::println);
		
		
		System.out.println("----- anuncios com preco menor ou igual 2000. Sem streams --------");
		
		//foreach
		System.out.println("----- lista 1 --------");
		lista.forEach(anuncioDaVez -> {
			if(anuncioDaVez.getPreco()<=2000 && anuncioDaVez.getRelevancia()>0) {
				System.out.println(anuncioDaVez);
			}
		});
		
		System.out.println("----- lista 2 --------");
		lista.stream()
			.filter(item -> item.getPreco() <= 2000)
			.filter(item -> item.getPreco() >= 1990)
			.filter(item -> item.getRelevancia() > 0)
			.forEach(System.out::println);
		
		System.out.println("----- lista 3 --------");
		List<Anuncio> baratos = lista.stream()
				.filter(item -> item.getPreco() <= 2000).collect(Collectors.toList());
		baratos.forEach(System.out::println);
		
	}
	
	
	
	
}

//Collections.sort(lista, new Comparator<Anuncio>() {
//@Override
//public int compare(Anuncio o1, Anuncio o2) {
//	if(o1.getPreco() < o2.getPreco())
//		return -1;
//	if(o1.getPreco() == o2.getPreco())
//		return 0;
//	if(o1.getPreco() > o2.getPreco())
//		return 1;
//	return 0;
//}
//});


//Collections.sort(lista, new Comparator<Anuncio>() {
//@Override
//public int compare(Anuncio o1, Anuncio o2) {
//	if(o1.getPreco() < o2.getPreco())
//		return 1;
//	if(o1.getPreco() == o2.getPreco())
//		return 0;
//	if(o1.getPreco() > o2.getPreco())
//		return -1;
//	return 0;
//}
//});
