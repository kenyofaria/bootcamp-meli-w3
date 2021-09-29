package br.com.meli.service.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.meli.entity.Vendedor;
import br.com.meli.persistence.VendedorPersistence;
import br.com.meli.service.VendedorService;

class VendedorServiceTest {

	@Test
	void deve_Cadastrar_Vendedor() throws IOException {
		VendedorPersistence mock = Mockito.mock(VendedorPersistence.class);
		
		ArrayList<Vendedor> lista = new ArrayList<>();
		Vendedor vendedor = new Vendedor("922.345.123-10", "Kenyo", "Gyn", "GO", LocalDate.parse("1980-02-25")); 
		
		Mockito.when(mock.cadastro(Mockito.any(Vendedor.class), Mockito.any(Boolean.class)))
		.thenReturn(vendedor);
		Mockito.when(mock.listagem())
		.thenReturn(lista);
		
		VendedorService vendedorService = new VendedorService(mock);                  			
		vendedorService.cadastrar(vendedor);    
		assertNotNull(vendedor.getCodigo());
	}
	
	@Test
	void naoDeve_Cadastrar_Vendedor_Quando_Cpf_Existente() throws IOException {
		VendedorPersistence mock = Mockito.mock(VendedorPersistence.class);
		
		ArrayList<Vendedor> lista = new ArrayList<>();
		Vendedor vendedor = new Vendedor("922.345.123-10", "Kenyo", "Gyn", "GO", LocalDate.parse("1980-02-25"));
		lista.add(vendedor);
		
		Mockito.when(mock.cadastro(Mockito.any(Vendedor.class), Mockito.any(Boolean.class)))
		.thenReturn(vendedor);
		
		Mockito.when(mock.listagem())
		.thenReturn(lista);
		
		VendedorService vendedorService = new VendedorService(mock);
		
		RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()->{
			vendedorService.cadastrar(vendedor);     
		});
	    String expectedMessage = "CPF em uso";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void naoDeve_Cadastrar_Vendedor_Menor_Idade() throws IOException {
		VendedorPersistence mock = Mockito.mock(VendedorPersistence.class);
		
		ArrayList<Vendedor> lista = new ArrayList<>();
		Vendedor vendedor = new Vendedor("922.345.123-10", "Kenyo", "Gyn", "GO", LocalDate.parse("2005-02-25")); 				//preparacao do cenário (setup)
		
		Mockito.when(mock.cadastro(Mockito.any(Vendedor.class), Mockito.any(Boolean.class)))
		.thenReturn(vendedor);
		Mockito.when(mock.listagem())
		.thenReturn(lista);
		
		VendedorService vendedorService = new VendedorService(mock); 
		
		RuntimeException exception = Assertions.assertThrows(RuntimeException.class, ()->{
			vendedorService.cadastrar(vendedor);  
		});

	    String expectedMessage = "Vendedor menor de idade";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}

}
