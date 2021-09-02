package com.dh.meli.w3.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dh.meli.w3.entity.Aluno;

public class AlunoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sexo;
	private LocalDate dataNascimento;
	
	
	public AlunoDto() {
	}


	public AlunoDto(String nome, String sexo, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
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

	public Aluno converte() {
		Aluno aluno = new Aluno(this.nome, this.sexo, this.dataNascimento);
		return aluno;
	}
	public static AlunoDto converte(Aluno aluno) {
		AlunoDto alunoDto = new AlunoDto(aluno.getNome(), aluno.getSexo(), aluno.getDataNascimento());
		return alunoDto;
	}
}
