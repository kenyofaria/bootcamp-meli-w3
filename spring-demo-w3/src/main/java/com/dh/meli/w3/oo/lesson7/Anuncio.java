package com.dh.meli.w3.oo.lesson7;

public class Anuncio implements Comparable<Anuncio>{

	private String codigo;
	private String titulo;
	private String descricao;
	private double preco;
	private Integer totalVendas = 0;
	
	public Anuncio(String codigo, String titulo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}
	public Integer getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(Integer totalVendas) {
		this.totalVendas = totalVendas;
	}
	public void incrementaVenda(int valor) {
		totalVendas+=valor;
	}
	@Override
	public String toString() {
		return codigo + " " + titulo + " " + preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		Anuncio a = (Anuncio) obj;
		return this.codigo.equals(a.getCodigo());
	}

	@Override
	public int compareTo(Anuncio o) {
		// se o atributo comparado for menor que o atributo do parametro, retorna -1
		// se os atributos forem iguais, retorna zero
		// se o atributo comparado for maior que o atributo do parametro, retorna 1
		
		//return this.titulo.compareToIgnoreCase(o.getTitulo());
		if(this.preco < o.getPreco())
			return -1;
		if(this.preco == o.getPreco())
			return 0;
		if(this.preco > o.getPreco())
			return 1;
		return 0;
	}


}
