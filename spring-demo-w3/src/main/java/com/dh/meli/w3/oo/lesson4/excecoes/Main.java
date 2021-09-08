package com.dh.meli.w3.oo.lesson4.excecoes;

import java.io.IOException;
import java.text.DecimalFormat;

import com.dh.meli.w3.oo.lesson3.Funcionario;
import com.dh.meli.w3.oo.lesson4.model.Desenvolvedor;

public class Main {

	public static void main(String[] args) {
		
		
		Funcionario f = new Funcionario("kenyo", "m", 340.90);
		
		Classe1 obj1 = new Classe1();
		try {
			obj1.metod1();
			System.out.println("programa finalizado");
			
		}catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();	
		}
	}
}
