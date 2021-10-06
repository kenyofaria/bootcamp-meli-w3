package br.com.meli.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //estamos informando ao RDBMS que o id será gerado automaticamente
	private Long id;
	private LocalDate data;
	private BigDecimal valorTotal;
	private String formaPagamento; //a vista ou a prazo
	
	
	public Venda() {
		super();
	}
	
	public Venda(Long id, LocalDate data, BigDecimal valorTotal, String formaPagamento) {
		super();
		this.id = id;
		this.data = data;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPagamento;
	}
	public Venda(LocalDate data, BigDecimal valorTotal, String formaPagamento) {
		super();
		this.data = data;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPagamento;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
