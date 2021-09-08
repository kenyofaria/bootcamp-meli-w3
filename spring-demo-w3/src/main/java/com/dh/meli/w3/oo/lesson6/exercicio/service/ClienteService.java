package com.dh.meli.w3.oo.lesson6.exercicio.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import com.dh.meli.w3.oo.lesson6.exercicio.excecoes.ClienteExistenteException;
import com.dh.meli.w3.oo.lesson6.exercicio.excecoes.MenorIdadeException;
import com.dh.meli.w3.oo.lesson6.exercicio.model.Cliente;

public class ClienteService {
	
	private static List<Cliente> clientes = new ArrayList<>();
	

	
	public void adiciona(Cliente cliente) throws ClienteExistenteException, MenorIdadeException{
		if(clienteCadastrado(cliente)) {
			throw new ClienteExistenteException("cliente já cadastrado.");
		}
		if(!maiorIdade(cliente)) {
			throw new MenorIdadeException("cliente menor de idade.");
		}
		clientes.add(cliente);
	}
	
	
	private static boolean clienteCadastrado(Cliente cliente) {
		return clientes.contains(cliente);
	}
	
	private boolean maiorIdade(Cliente cliente) {
		long qtdeAnos = ChronoUnit.YEARS.between(cliente.getDataNascimento(), LocalDate.now());
		return (qtdeAnos >= 18);
	}
}
