package br.com.meli.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AnuncioDTO {

	
	private String codigo;
	@NotNull(message = "title is mandatory")
	@NotBlank(message = "title is mandatory")
	private String titulo;
	private BigDecimal preco;
	private Integer quantidade;


	public AnuncioDTO(String codigo, String titulo, BigDecimal preco, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

}
