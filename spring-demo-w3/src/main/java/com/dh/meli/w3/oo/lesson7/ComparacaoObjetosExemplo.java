package com.dh.meli.w3.oo.lesson7;

public class ComparacaoObjetosExemplo {

	public static void main(String[] args) {
		Anuncio a = new Anuncio("MLB1","moto G8","",80);
		Anuncio b = new Anuncio("MLB2","moto G8","",80);
		
		if(a.equals(b)) {
			System.out.println("são iguais");
		}else {
			System.out.println("são diferentes");
		}
	}
}
