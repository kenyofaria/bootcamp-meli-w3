package br.com.meli.dto;

import br.com.meli.entity.Vendedor;

public class VendedorDTO {

	private String cpf;
	private String nome;
	private String cidade;
	private String uf;
	
	public VendedorDTO(String cpf, String nome, String cidade, String uf) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}
	
	public static VendedorDTO converte(Vendedor vendedor) {
		return new VendedorDTO(vendedor.getCpf(), vendedor.getNome(), vendedor.getCidade(), vendedor.getUf());
	}
	
	public static Vendedor converte(VendedorDTO vendedor) {
		return new Vendedor(vendedor.getCpf(), vendedor.getNome(), vendedor.getCidade(), vendedor.getUf());
	}
}
