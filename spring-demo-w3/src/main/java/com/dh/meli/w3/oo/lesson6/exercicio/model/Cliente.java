package com.dh.meli.w3.oo.lesson6.exercicio.model;

import java.time.LocalDate;

public class Cliente {

	
	private String nome;
	private LocalDate dataNascimento;
	
	
	
	
	
	public Cliente(String nome, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	
	
}
