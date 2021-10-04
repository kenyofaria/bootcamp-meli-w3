package br.com.meli.service.integration.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.entity.Pedido;
import br.com.meli.service.PedidoService;



@SpringBootTest
public class PedidoServiceTest {

	@Autowired
	private PedidoService service;
	
	@Test
	public void test1() {
		Pedido pedido = new Pedido("23456789", LocalDate.now());
		service.salva(pedido);
		assertEquals(1, service.getList().size());
		
	}
}
