package br.com.meli.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Venda {

	
	private LocalDate data;
	private String fornecedor;
	private String cliente;
	private BigDecimal total;
	
	
	public Venda(LocalDate data, String fornecedor, String cliente, BigDecimal total) {
		super();
		this.data = data;
		this.fornecedor = fornecedor;
		this.cliente = cliente;
		this.total = total;
	}
	public LocalDate getData() {
		return data;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public String getCliente() {
		return cliente;
	}
	public BigDecimal getTotal() {
		return total;
	}
	
	
}
