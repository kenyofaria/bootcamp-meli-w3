package br.com.meli;

import br.com.meli.dao.VendedorPersistence;
import br.com.meli.entity.Vendedor;
import br.com.meli.service.VendedorService;

public class Main {

	
	public static void main(String[] args) {
		//insercao();
		//atualizacao();
		//listagem();
		exclusao();
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
		Vendedor vendedor = new Vendedor("MLB320", "000.654.123-90", "ana Ferreira", "rua ZZZ", "MG", "ouro fino");
		service.salva(vendedor);
	}

	private static void insercao() {
		VendedorPersistence vendedorPersistence = new VendedorPersistence(); //like a mock :)
		VendedorService service = new VendedorService(vendedorPersistence);
		Vendedor vendedor = new Vendedor("000.654.123-90", "Ana", "rua ZZZ", "MG", "ouro fino");
		service.salva(vendedor);
	}
}
