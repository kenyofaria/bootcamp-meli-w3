package com.dh.meli.w3.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dh.meli.w3.entity.Aluno;
import com.dh.meli.w3.entity.Situacao;

public class AlunoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sexo;
	private LocalDate dataNascimento;
	
	private Situacao situacao;
	
	
	public AlunoDto() {
	}


	public AlunoDto(String nome, String sexo, LocalDate dataNascimento, Situacao situacao) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.setSituacao(situacao);
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
		Aluno aluno = new Aluno(this.nome, this.sexo, this.dataNascimento, this.situacao);
		return aluno;
	}
	public static AlunoDto converte(Aluno aluno) {
		AlunoDto alunoDto = new AlunoDto(aluno.getNome(), aluno.getSexo(), aluno.getDataNascimento(), aluno.getSituacao());
		return alunoDto;
	}


	public Situacao getSituacao() {
		return situacao;
	}


	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
