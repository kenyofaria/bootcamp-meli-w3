package com.dh.meli.w3.oo.lesson5;

import com.dh.meli.w3.oo.lesson5.model.Cliente;
import com.dh.meli.w3.oo.lesson5.model.Desenvolvedor;
import com.dh.meli.w3.oo.lesson5.util.ArquivoUtil;

public class Main {

	public static void main(String[] args) {
		Desenvolvedor joice = new Desenvolvedor("mauri", "m", 10000, "mauri", "123");
		Cliente nobre = new Cliente("nobre", "123");
		
		ArquivoUtil arquivoUtil = new ArquivoUtil();
		arquivoUtil.escreveObjetoArquivoTexto(joice);
		arquivoUtil.fechaArquivo();
		
		joice.autentica("joice", "123");
		nobre.autentica("nobre", "123");
		
		
	}
}
