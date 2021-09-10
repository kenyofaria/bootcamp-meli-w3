package com.dh.meli.w3.oo.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoString {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("kenyo");
		lista.add("edenilson");
		lista.add("mauri");
		lista.add("ana");
		lista.add("bruno");
		lista.add("silas");
	
		System.out.println("------- lista original ---------------");
		for (String s : lista) {
			System.out.println(s);
		}
		Collections.sort(lista);
		System.out.println("------- lista ordenada ---------------");
		for (String s : lista) {
			System.out.println(s);
		}
	}
}
