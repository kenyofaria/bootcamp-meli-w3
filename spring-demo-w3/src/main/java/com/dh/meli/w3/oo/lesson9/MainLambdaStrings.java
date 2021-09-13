package com.dh.meli.w3.oo.lesson9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainLambdaStrings {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("kenyo","joice","filipe","mauri","ana","alessandro","marco");
		
		System.out.println("------ iterator ------");
		Collections.sort(lista);
		
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		System.out.println("------ loop ------");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("------ foreach ------");
		for (String s : lista) {
			System.out.println(s);
		}
		
		System.out.println("------ lambda ------");
		lista.forEach(s -> System.out.println(s));
		
	}
}
