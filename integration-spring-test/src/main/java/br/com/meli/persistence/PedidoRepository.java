package br.com.meli.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.meli.entity.Pedido;

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
