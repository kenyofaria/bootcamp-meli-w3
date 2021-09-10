package com.dh.meli.w3.oo.lesson8;

public class Paciente {

	private long id;
	private String nome;
	
	
	public Paciente(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	
}
