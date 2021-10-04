package br.com.meli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.exemplo.unit.test.Pedido;
import br.com.meli.exemplo.unit.test.PedidoService;

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
