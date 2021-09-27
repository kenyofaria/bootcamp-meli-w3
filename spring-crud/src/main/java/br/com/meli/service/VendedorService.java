package br.com.meli.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import br.com.meli.entity.Vendedor;
import br.com.meli.persistence.VendedorPersistence;


@Service
public class VendedorService {

	private VendedorPersistence persistence = new VendedorPersistence();
	
	
	private boolean cpfNaoUtilizado(String cpf) {
		Optional<Vendedor> vendedor = persistence.listagem().stream().filter(v -> v.getCpf().equals(cpf)).findAny();
		return vendedor.isPresent();
	}
	
	
	public void cadastrar(Vendedor vendedor) {
		if(cpfNaoUtilizado(vendedor.getCpf())) {
			vendedor.setCodigo(String.valueOf("MLB" + ThreadLocalRandom.current().nextInt(100, 999)));
			try {
				persistence.cadastro(vendedor, true);
			} catch (IOException e) {
				throw new RuntimeException("Erro no momento de cadastrar o vendedor");
			}
		}else {
			throw new RuntimeException("CPF em uso");
		}
	}


	public void remover(String codigo) {
		
		List<Vendedor> vendedores = persistence.listagem();
		Iterator<Vendedor> iterator = vendedores.iterator();
		while(iterator.hasNext()) {
			Vendedor v = iterator.next();
			if(v.getCodigo().equalsIgnoreCase(codigo)) {
				iterator.remove();
			}
		}
		try {
			persistence.cadastro(vendedores);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("erro ao persistir os vendedores");
		}
		
		
	}
	
}
