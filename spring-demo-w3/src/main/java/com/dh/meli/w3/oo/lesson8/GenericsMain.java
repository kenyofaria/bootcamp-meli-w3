package com.dh.meli.w3.oo.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GenericsMain {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList();
		Scanner console = new Scanner(System.in);
		String opcao = "";
		imprimeMenu();
		opcao = console.nextLine();
		while(opcao!=null) {
			switch (opcao) {
				case "1":
					System.out.println("entre com o numero: ");
					opcao = console.nextLine();
					try {
						Integer valor = Integer.parseInt(opcao);
						numeros.add(valor);						
					}catch(NumberFormatException e) {
						System.out.println("entrada invalida");
					}finally {
						break;
					}
	
				case "2":
					System.out.println("realizando o calculo: ");
					Iterator<Integer> iterator = numeros.iterator();
					while(iterator.hasNext()) {
						System.out.println(iterator.next() + 1);
					}
				default:
					break;
			}
			imprimeMenu();
			opcao = console.nextLine();
			
		}
	}

	private static void imprimeMenu() {
		System.out.println("----------------------------------------");
		System.out.println("  1. para entrar com um numero");
		System.out.println("  2. calcular");
		System.out.println("  3. sair");
		System.out.println("----------------------------------------");
	}
}
