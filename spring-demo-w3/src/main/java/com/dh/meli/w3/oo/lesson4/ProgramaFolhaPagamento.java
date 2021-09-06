package com.dh.meli.w3.oo.lesson4;

import com.dh.meli.w3.oo.lesson4.model.CalculadorFolha;
import com.dh.meli.w3.oo.lesson4.model.Desenvolvedor;
import com.dh.meli.w3.oo.lesson4.model.Funcionario;
import com.dh.meli.w3.oo.lesson4.model.Gerente;
import com.dh.meli.w3.oo.lesson4.model.Vendedor;

public class ProgramaFolhaPagamento {

	
	public static void main(String[] args) {
		
		Funcionario kenyo = new Funcionario("kenyo", "m", 3000.198);
		Funcionario mauri = new Funcionario("mauri", "m", 5000.198);
		Funcionario joice = new Funcionario("joice", "f", 7000.198);
		Funcionario filipe = new Funcionario("filipe", "m", 10000.198);
		Funcionario thiago = new Gerente("thiago", "m", 13000);
		Funcionario ana = new Vendedor("ana carolina", "f", 20000, 100000);
		Funcionario nobre = new Desenvolvedor("nobre", "m", 20000, "nobre@mail.com","radioNobre");
		Funcionario[] array = {kenyo, mauri, joice, filipe, thiago, ana, nobre};
		
		CalculadorFolha folha = new CalculadorFolha();
		double total = folha.calcula(array);
		
		System.out.println("total da folha de pagamento: " + total);
	}
}
