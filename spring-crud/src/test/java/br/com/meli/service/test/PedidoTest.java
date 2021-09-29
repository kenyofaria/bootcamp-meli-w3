package br.com.meli.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.meli.exemplo.unit.test.CartaoDeCreditoChecker;
import br.com.meli.exemplo.unit.test.ItemPedido;
import br.com.meli.exemplo.unit.test.Pedido;

public class PedidoTest {

	@Test
	public void deveAdicionarItensAoPedido() {

		Pedido pedido = new Pedido("112345678", LocalDate.now());
		pedido.adicionaItem(new ItemPedido("Luva de boxe", new BigDecimal(100)));
		
		assertEquals(new BigDecimal(100), pedido.getTotal());
		
	}
	
	@Test
	public void deveAdicionarItensAoPedidoQuandoCincoItens() {

		Pedido pedido = new Pedido("112345678", LocalDate.now());
		pedido.adicionaItem(new ItemPedido("Luva de boxe", new BigDecimal(100)));
		pedido.adicionaItem(new ItemPedido("Punch", new BigDecimal(200)));
		pedido.adicionaItem(new ItemPedido("Bola", new BigDecimal(100)));
		pedido.adicionaItem(new ItemPedido("Meia", new BigDecimal(30)));
		pedido.adicionaItem(new ItemPedido("Camisa do Goias", new BigDecimal(1000)));
		
		assertEquals(new BigDecimal(1430), pedido.getTotal());
		
	}
	
	@Test
	public void naoDeveAdicionarItensQuandoItemJaExistente() {
		Pedido pedido = new Pedido("112345678", LocalDate.now());
		pedido.adicionaItem(new ItemPedido("Luva de boxe", new BigDecimal(100)));
		
		
		RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()->{
			pedido.adicionaItem(new ItemPedido("Luva de boxe", new BigDecimal(100)));  
		});

	    String expectedMessage = "item duplicado";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void deveFecharPedidoQuandoCartaoRetornarSucesso() {
		CartaoDeCreditoChecker mock = Mockito.mock(CartaoDeCreditoChecker.class);
		
		Mockito.when(mock.paga(Mockito.any(BigDecimal.class))).thenReturn(true);
		
		Pedido pedido = new Pedido(mock).comNumero("4567890").em(LocalDate.now()).build();
		
		pedido.adicionaItem(new ItemPedido("Luva de boxe", new BigDecimal(100)));
		
		pedido.fecha(); //unit under test
		
		assertEquals("PAGO", pedido.getStatus());
	}
	
	
	@Test
	public void nadoDeveFecharPedidoQuandoCartaoFalhar() {
		CartaoDeCreditoChecker impostor = Mockito.mock(CartaoDeCreditoChecker.class);
		Mockito.when(
					impostor.paga(
									Mockito.any(BigDecimal.class)
							)
				).thenReturn(false);
		
		Pedido pedido = new Pedido(impostor).comNumero("4567890").em(LocalDate.now()).build();
		
		pedido.adicionaItem(new ItemPedido("Luva de boxe", new BigDecimal(100)));
		
		
		RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()->{
			pedido.fecha(); //unit under test  
		});
		
		String expectedMessage = "Pagamento nao efetuado";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
}
