package br.com.meli.entity;


public class Vendedor {

	private String codigo;
	private String cpf;
	private String nome;
	private String cidade;
	private String uf;
	
	
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
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
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
	
	
}
