package com.dh.meli.w3.entity;

import java.time.LocalDate;

public class Aluno {
	
	private Long id;
	private String nome;
	private String sexo;
	private LocalDate dataNascimento;
	private String senha;


	private Situacao situacao;
	
	public Aluno() {
		this.senha = String.valueOf(Long.MAX_VALUE);
	}


	public Aluno(String nome, String sexo, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public Aluno(String nome, String sexo, LocalDate dataNascimento, Situacao situacao) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "nome: " + this.nome + "\n"
				+ "sexo: " + this.sexo + "\n"
				+ "ano nascimento: " + this.dataNascimento.getYear();
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Situacao getSituacao() {
		return situacao;
	}


	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
}
