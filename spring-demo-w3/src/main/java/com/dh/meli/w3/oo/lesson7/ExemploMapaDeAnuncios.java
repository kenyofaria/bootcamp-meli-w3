package com.dh.meli.w3.oo.lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploMapaDeAnuncios {

	public static void main(String[] args) {
		
		Anuncio ps5 = new Anuncio("MLB111", "ps 5", "", 4000);
		Anuncio xBox = new Anuncio("MLB222", "x box", "", 3500);
		Anuncio mac = new Anuncio("MLB333", "Macbook pro 13", "", 10000);
		
		List<Venda> vendas = new ArrayList<>();
		
		registraVendas(ps5, xBox, mac, vendas);
		
		Map<String, Integer> mapa = new HashMap<>();
		
		for(Venda v: vendas) {
			v.getAnuncio().incrementaVenda(v.getQuantidade());
			mapa.put(v.getAnuncio().getCodigo(), v.getAnuncio().getTotalVendas());
		}
		
	}

	private static void registraVendas(Anuncio ps5, Anuncio xBox, Anuncio mac, List<Venda> vendas) {
		vendas.add(new Venda(1, ps5, 1));
		vendas.add(new Venda(2, ps5, 1));
		vendas.add(new Venda(3, ps5, 1));
		vendas.add(new Venda(4, ps5, 1));
		vendas.add(new Venda(5, ps5, 1));
		vendas.add(new Venda(6, xBox, 1));
		vendas.add(new Venda(7, ps5, 1));
		vendas.add(new Venda(8, mac, 300));
		vendas.add(new Venda(9, xBox, 3));
	}
}
