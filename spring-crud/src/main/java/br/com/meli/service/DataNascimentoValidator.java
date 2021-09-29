package br.com.meli.service;

import java.time.LocalDate;
import java.time.Period;

import br.com.meli.entity.Vendedor;

public class DataNascimentoValidator implements Validador<Vendedor>{

	@Override
	public void valida(Vendedor vendedor) {

		if(!maiorIdade(vendedor))
			throw new RuntimeException("o vendedor precisa ser maior de idade");
		
		
	}

	public boolean maiorIdade(Vendedor vendedor) {
		int idade = Period.between(vendedor.getDataNascimento(), LocalDate.now()).getYears();
		return idade>=18;
	}
	

}
