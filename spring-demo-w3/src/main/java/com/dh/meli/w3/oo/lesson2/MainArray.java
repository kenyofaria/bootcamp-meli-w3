package com.dh.meli.w3.oo.lesson2;

public class MainArray {

	
	
	public static void main(String[] args) {
		
		Roupa[] roupas;
		roupas = new Roupa[5];
		
		roupas[0] = new Roupa("casaco", "preta", "slim", "P", "outuno/inverno");
		roupas[1] = new Roupa("blusa", "azul", "slim", "P", "outuno/inverno");
		roupas[2] = new Roupa("camiseta", "branca", "despojada", "P", "primavera/verao");
		roupas[3] = new Roupa("bermuda", "jeans", "curto", "P", "verao");
		roupas[4] = new Roupa("calça", "laranha", "slim", "G", "outuno/inverno");
		
		for(int i=0; i<roupas.length; i++) {
			System.out.println(roupas[i].descricao);
		}
		

	}
	
}
