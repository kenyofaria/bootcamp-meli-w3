package br.com.meli.exemplo.unit.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepository {

	private static List<Pedido> listaDePedidos = new ArrayList<>();

	
	public void salva(Pedido pedido) {
		listaDePedidos.add(pedido);
	}
	
	public List<Pedido> getList(){
		return listaDePedidos;
	}
}
