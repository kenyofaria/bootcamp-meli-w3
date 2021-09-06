package com.dh.meli.w3.oo.lesson4.excecoes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		Classe1 obj1 = new Classe1();
		try {
			obj1.metod1();
			System.out.println("programa finalizado");
			
		}catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
//			System.out.println(e.getCause());
//			System.out.println(e.getMessage());
			
		}
	}
}
