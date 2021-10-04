package br.com.meli.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.meli.service.CartaoDeCreditoChecker;

public class Pedido {

	private String numero;
	private LocalDate data;
	private BigDecimal total = new BigDecimal(0);
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	private String status;
	private CartaoDeCreditoChecker cartaoChecker;

	
	public Pedido(CartaoDeCreditoChecker cartaoChecker) {
		this.cartaoChecker = cartaoChecker;
	}
	
	public Pedido comNumero(String numero) {
		this.numero = numero;
		return this;
	}
	
	public Pedido em(LocalDate data) {
		this.data = data;
		return this;
	}
	
	public Pedido build() {
		return this;
	}
	
	public Pedido(String numero, LocalDate data) {
		super();
		this.numero = numero;
		this.data = data;
		this.status = "PENDENTE";
	}
	
	public String getNumero() {
		return numero;
	}
	public LocalDate getData() {
		return data;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public List<ItemPedido> getItens() {
		itens.sort((ItemPedido a, ItemPedido b) -> a.getDescricao().compareTo(b.getDescricao()));
		return itens;
	}
	public String getStatus() {
		return status;
	}
	public void adicionaItem(ItemPedido item) {
		if(this.itens.contains(item))
			throw new RuntimeException("item duplicado");
		itens.add(item);
		total = total.add(item.getPreco());
	}
	public void fecha() {
		boolean pedidoPago = this.cartaoChecker.paga(this.total);
		if(pedidoPago) {
			this.status = "PAGO";
		}else {
			throw new RuntimeException("Pagamento nao efetuado");
		}
	}
	
}
