package br.com.meli.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import br.com.meli.entity.Vendedor;
import br.com.meli.persistence.VendedorPersistence;
@SuppressWarnings("rawtypes")
@Service
public class VendedorService {

	private VendedorPersistence persistence;

	
	private List<Validador> validadores = new ArrayList<Validador>();
	
	public VendedorService(VendedorPersistence persistence) {
		this.persistence = persistence;
		validadores.add(new DataNascimentoValidator());
		validadores.add(new CpfValidator());
		
	}
	
	private boolean cpfUtilizado(String cpf) {
		Optional<Vendedor> vendedor = persistence.listagem().stream()
				.filter(v -> v.getCpf().equals(cpf))
				.findAny();
		return vendedor.isPresent();
	}

	public void cadastrar(Vendedor vendedor) {
		if (!cpfUtilizado(vendedor.getCpf())) {
			
			validadores.forEach(validador ->{
				validador.valida(vendedor);
			});
			try {
				vendedor.setCodigo(String.valueOf("MLB" + ThreadLocalRandom.current().nextInt(1000, 9999)));
				persistence.cadastro(vendedor, true);
			} catch (IOException e) {
				throw new RuntimeException("Erro no momento de cadastrar o vendedor");
			}
		} else {
			throw new RuntimeException("CPF em uso");
		}
	}
	


	public List<Vendedor> listar() {
		return persistence.listagem();
	}

	public void remover(String codigo) {

		List<Vendedor> vendedores = persistence.listagem();
		Iterator<Vendedor> iterator = vendedores.iterator();
		while (iterator.hasNext()) {
			Vendedor v = iterator.next();
			if (v.getCodigo().equalsIgnoreCase(codigo)) {
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
