package br.com.meli.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anuncios")
public class Anuncio {

	@Id
	private String codigo;
	private String titulo;
	private BigDecimal preco;
	@Column(name="data_anuncio")
	private LocalDate dataAnuncio;
	@Column(name="num_vendas")
	private int numeroVendas;

	public Anuncio() {
		// TODO Auto-generated constructor stub
	}

	public Anuncio(String titulo, BigDecimal preco, LocalDate dataAnuncio, int numeroVendas) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.dataAnuncio = dataAnuncio;
		this.numeroVendas = numeroVendas;
	}
	
	public Anuncio(String codigo, String titulo, BigDecimal preco, LocalDate dataAnuncio, int numeroVendas) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.dataAnuncio = dataAnuncio;
		this.numeroVendas = numeroVendas;
	}
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(LocalDate dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
	
	
}

