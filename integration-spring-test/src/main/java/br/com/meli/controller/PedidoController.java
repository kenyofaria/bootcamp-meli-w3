package br.com.meli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.entity.Pedido;
import br.com.meli.service.PedidoService;


@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService service;
	
	@PostMapping
	public ResponseEntity<Pedido> cadastrar(@RequestBody Pedido pedido) {
		service.salva(pedido);
		return ResponseEntity.ok(pedido);
	}
	
	
}
