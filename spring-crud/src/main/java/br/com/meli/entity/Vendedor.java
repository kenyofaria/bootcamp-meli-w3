package br.com.meli.entity;

import java.time.LocalDate;

public class Vendedor {

	private String codigo;
	private String cpf;
	private String nome;
	private String cidade;
	private String uf;
	private LocalDate dataNascimento;
	
	
	public Vendedor(String codigo, String cpf, String nome, String cidade, String uf) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
	}
	public Vendedor(String cpf, String nome, String cidade, String uf) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public Vendedor(String cpf, String nome, String cidade, String uf, LocalDate dataNascimento) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public boolean equals(Object obj) {
		return this.cpf.equals(((Vendedor) obj).getCpf());
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
}
