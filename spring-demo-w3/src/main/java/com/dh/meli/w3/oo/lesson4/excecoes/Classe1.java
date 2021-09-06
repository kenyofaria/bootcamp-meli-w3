package com.dh.meli.w3.oo.lesson4.excecoes;

public class Classe1 {

	public void metod1() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println("executando o metodo 1");
		
		String[] array = {"k","e","n","y","o"};
		for(int i=0; i<= array.length; i++) {
			System.out.println("metodo 1: " + array[i]);
		}
		
		Classe2 obj2 = new Classe2();
		obj2.metod2();
		
		System.out.println("finalizando o metodo 1");
	}

}
