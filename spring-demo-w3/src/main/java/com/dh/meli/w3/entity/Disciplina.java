package com.dh.meli.w3.entity;

public class Disciplina {

	private String codigo;
	private String nome;
	
	public Disciplina() {
		this.setCodigo("codigo gerado no server");
	}

	public Disciplina(String nome) {
		super();
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
