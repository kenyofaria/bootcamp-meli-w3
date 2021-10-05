package br.com.meli.entity;

public class Vendedor {

	
	String codigo;
	String cpf;
	String nome;
	String endereco;
	String uf;
	String cidade;
	
	
	
	
	public Vendedor(String codigo, String cpf, String nome, String endereco, String uf, String cidade) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.uf = uf;
		this.cidade = cidade;
	}
	
	public Vendedor(String cpf, String nome, String endereco, String uf, String cidade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.uf = uf;
		this.cidade = cidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getUf() {
		return uf;
	}
	public String getCidade() {
		return cidade;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {		
		return this.codigo.concat(" -- " + this.nome).concat(" -- " + this.cpf).concat(" -- " + this.endereco).concat(" -- " + this.uf).concat(" -- " + this.cidade);
	}
	
}
