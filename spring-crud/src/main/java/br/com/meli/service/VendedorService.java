package br.com.meli.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import br.com.meli.entity.Vendedor;
import br.com.meli.persistence.VendedorPersistence;

@Service
public class VendedorService {

	private VendedorPersistence persistence;

	public VendedorService(VendedorPersistence persistence) {
		this.persistence = persistence;
	}
	
	private boolean cpfUtilizado(String cpf) {
		Optional<Vendedor> vendedor = persistence.listagem().stream()
				.filter(v -> v.getCpf().equals(cpf))
				.findAny();
		return vendedor.isPresent();
	}

	public void cadastrar(Vendedor vendedor) {
		if (!cpfUtilizado(vendedor.getCpf())) {
			if(!maiorIdade(vendedor))
				throw new RuntimeException("Vendedor menor de idade");
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
	
	private boolean maiorIdade(Vendedor vendedor) {
		int years = Period.between(vendedor.getDataNascimento(), LocalDate.now()).getYears();
		return years>=18;
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
