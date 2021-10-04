package br.com.meli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.entity.Pedido;
import br.com.meli.persistence.PedidoRepository;

@Service
public class PedidoService {

	
	@Autowired
	private PedidoRepository repository;

	public void salva(Pedido pedido) {
		this.repository.salva(pedido);
	}

	public List<Pedido> getList(){
		return this.repository.getList();
	}
}
