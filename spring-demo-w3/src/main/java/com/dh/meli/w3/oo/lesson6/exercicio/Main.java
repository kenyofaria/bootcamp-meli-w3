package com.dh.meli.w3.oo.lesson6.exercicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import com.dh.meli.w3.oo.lesson6.exercicio.excecoes.ClienteExistenteException;
import com.dh.meli.w3.oo.lesson6.exercicio.excecoes.MenorIdadeException;
import com.dh.meli.w3.oo.lesson6.exercicio.model.Cliente;
import com.dh.meli.w3.oo.lesson6.exercicio.service.ClienteService;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		ClienteService clienteService = new ClienteService();
		
		while(true) {
			System.out.println("\nentre com o nome do cliente");
			String nome = console.nextLine();
			System.out.println("\nentre com a data de nascimento do cliente");
			String dataNascimento = console.nextLine();
			
			if(nome.equalsIgnoreCase("exit") || dataNascimento.equalsIgnoreCase("exit")) {
				console.close();
				System.exit(0);
			}
			try {
				Cliente cliente = new Cliente(nome, LocalDate.parse(dataNascimento));
				clienteService.adiciona(cliente);
				System.out.println("cliente cadastrado com sucesso!!!\n\n");
			}catch(MenorIdadeException | ClienteExistenteException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}


}
