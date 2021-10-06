package br.com.meli;

import java.util.Arrays;
import java.util.List;

import br.com.meli.dao.VendedorPersistence;
import br.com.meli.entity.Endereco;
import br.com.meli.entity.Vendedor;
import br.com.meli.service.VendedorService;

public class Main {

	
	public static void main(String[] args) {
		//insercao();
		//atualizacao();
		//listagem();
		exclusao();
	}
	
	
	private static void insereVendedor() {
		System.out.println("-------------------- vendedores antes ----------------------");
		VendedorPersistence vendedorPersistence = new VendedorPersistence();
		vendedorPersistence.lista().forEach(v -> System.out.println(v));
		
		Vendedor vendedor = new Vendedor("MLB999", "000.999.000-11", "Wagner");
		List<Endereco> enderecosDoWagner = Arrays.asList(new Endereco("88888-888", "logradouro do wagner", "", 4005, "ES", "Vitória", vendedor)
														,new Endereco("12345-678", "logradouro do wagner no piauí", "", 12, "PI", "Terezina", vendedor));
		
		vendedor.setEnderecos(enderecosDoWagner);
		
		vendedorPersistence.insere(vendedor);
		
		
		
		System.out.println("\n\n\n-------------------- vendedores antes ----------------------");
		vendedorPersistence.lista().forEach(v -> System.out.println(v));
	}
	

	private static void exclusao() {
		VendedorPersistence vendedorPersistence = new VendedorPersistence(); //like a mock :)
		VendedorService service = new VendedorService(vendedorPersistence);
		String codigo = "MLB123";
		service.deleta(codigo);
	}

	private static void listagem() {
		VendedorPersistence vendedorPersistence = new VendedorPersistence(); //like a mock :)
		VendedorService service = new VendedorService(vendedorPersistence);
		service.listagem().forEach(v -> System.out.println(v));
	}

	private static void atualizacao() {
		VendedorPersistence vendedorPersistence = new VendedorPersistence(); //like a mock :)
		VendedorService service = new VendedorService(vendedorPersistence);
		Vendedor vendedor = new Vendedor("MLB320", "000.654.123-90", "ana Ferreira");
		
		Endereco endereco = new Endereco("22222-222", "logradouro ana", "", 4005, "ES", "Vitória", vendedor);
		List<Endereco> enderecosDoWagner = Arrays.asList(endereco);

		vendedor.setEnderecos(enderecosDoWagner);
		
		service.salva(vendedor);
	}

	private static void insercao() {
		VendedorPersistence vendedorPersistence = new VendedorPersistence(); //like a mock :)
		VendedorService service = new VendedorService(vendedorPersistence);
		Vendedor vendedor = new Vendedor("MLB873", "000.654.123-90", "Ana");
		service.salva(vendedor);
	}
}
