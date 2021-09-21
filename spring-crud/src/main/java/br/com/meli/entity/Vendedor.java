package br.com.meli.entity;


public class Vendedor {

	private String codigo;
	private String nome;
	
	
	public Vendedor(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	
	
}
