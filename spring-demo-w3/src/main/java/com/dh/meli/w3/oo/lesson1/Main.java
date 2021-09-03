package com.dh.meli.w3.oo.lesson1;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("dois de trinta");
		
		Roupa casaco; //definicao da variavel casaco
		casaco = new Roupa(); //instanciando casaco como um objeto da classe Roupa
		
		casaco.descricao = "casaco";
		casaco.colecao = "outuno/inverno";
		casaco.cor = "preta";
		casaco.tamanho = "P";
		casaco.modelo = "slim";
		
		System.out.println(casaco.descricao);
		System.out.println(casaco.colecao);
		System.out.println(casaco.cor);
		System.out.println(casaco.tamanho);
		System.out.println(casaco.modelo);
		
		Roupa roupa;
		roupa = casaco;
		
		casaco = null;
		
		System.out.println(roupa.descricao);
		System.out.println(roupa.colecao);
		System.out.println(roupa.cor);
		System.out.println(roupa.tamanho);
		System.out.println(roupa.modelo);
		
		
		Sapato bicoFino;
		bicoFino = new Sapato();
		bicoFino.cor = "vermelha";
		bicoFino.marca = "Arezzo";
		bicoFino.modelo = "bico fino";
		bicoFino.tamanho = 35;
		
		System.out.println(bicoFino.cor);
		System.out.println(bicoFino.marca);
		System.out.println(bicoFino.modelo);
		System.out.println(bicoFino.tamanho);
		
		Sapato sapatoSport;
		sapatoSport = new Sapato();
		
		sapatoSport.modelo = "sport";
		sapatoSport.cor = "azul";
		sapatoSport.tamanho = 40;
		sapatoSport.marca = "Adidas";
		
		System.out.println(sapatoSport.cor);
		System.out.println(sapatoSport.marca);
		System.out.println(sapatoSport.modelo);
		System.out.println(sapatoSport.tamanho);
	}
}
