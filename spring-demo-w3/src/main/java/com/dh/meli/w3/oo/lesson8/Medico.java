package com.dh.meli.w3.oo.lesson8;

public class Medico {

	private long id;
	private String numeroRegistro;
	private String nome;
	
	
	
	public Medico(long id, String numeroRegistro, String nome) {
		super();
		this.id = id;
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public String getNome() {
		return nome;
	}
	
	
}
