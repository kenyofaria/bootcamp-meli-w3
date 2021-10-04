package br.com.meli.service;

import br.com.meli.entity.Vendedor;

public class CpfValidator implements Validador<Vendedor>{

	@Override
	public void valida(Vendedor vendedor) {
		if(vendedor.getCpf() == null || vendedor.getCpf().isEmpty())
			throw new RuntimeException("cpf é obrigatório");
	}

}
