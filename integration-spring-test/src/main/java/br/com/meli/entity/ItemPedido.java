package br.com.meli.entity;

import java.math.BigDecimal;

public class ItemPedido {

	private String descricao;
	private BigDecimal preco;
	
	public ItemPedido(String descricao, BigDecimal preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		ItemPedido item = (ItemPedido) obj;
		return this.descricao.equals(item.getDescricao());
	}
	
}
