package com.dh.meli.w3.oo.lesson4;

import java.io.IOException;

import com.dh.meli.w3.oo.lesson4.model.Desenvolvedor;
import com.dh.meli.w3.oo.lesson4.model.Funcionario;
import com.dh.meli.w3.oo.lesson4.model.Gerente;
import com.dh.meli.w3.oo.lesson4.model.Vendedor;
import com.dh.meli.w3.oo.lesson4.util.ArquivoUtil;

public class ProgramaArmazenamentoArquivo {

	public static void main(String[] args) throws IOException {
		Funcionario kenyo = new Funcionario("kenyo", "m", 3000.198);
		Funcionario mauri = new Funcionario("mauri", "m", 5000.198);
		Funcionario joice = new Funcionario("joice", "f", 7000.198);
		Funcionario filipe = new Funcionario("filipe", "m", 10000.198);
		Funcionario thiago = new Gerente("thiago", "m", 13000);
		Funcionario ana = new Vendedor("ana carolina", "f", 20000, 100000);
		Funcionario nobre = new Desenvolvedor("nobre", "m", 20000, "nobre@mail.com","radioNobre");
		
		ArquivoUtil arquivoUtil = new ArquivoUtil();
		
		Funcionario[] funcionarios = {kenyo, mauri, joice, filipe, thiago, ana, nobre};
		
		arquivoUtil.escreveObjetoArquivoTexto(funcionarios);
		
		arquivoUtil.fechaArquivo();
	}
}
