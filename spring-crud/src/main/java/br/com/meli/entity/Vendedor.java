package br.com.meli.entity;

import java.time.LocalDate;

public class Vendedor {

	private String codigo;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	
	private Endereco endereco;
	
	
	public Vendedor(String codigo, String cpf, String nome) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
	}
	public Vendedor(String codigo, String cpf, String nome, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	public Vendedor(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;

	}
	
	public Vendedor(String cpf, String nome, LocalDate dataNascimento) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Vendedor(String cpf, String nome, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
