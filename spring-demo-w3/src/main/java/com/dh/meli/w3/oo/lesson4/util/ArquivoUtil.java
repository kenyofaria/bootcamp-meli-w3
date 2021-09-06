package com.dh.meli.w3.oo.lesson4.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.dh.meli.w3.oo.lesson4.model.Funcionario;

public class ArquivoUtil {

	private BufferedWriter bw;

	public ArquivoUtil() throws IOException{
		FileOutputStream fos = new FileOutputStream("funcionarios.txt", true);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		bw = new BufferedWriter(osw);
	}
	
	public void escreveObjetoArquivoTexto(Funcionario funcionario) throws IOException {
		bw.append(funcionario.toString());
		bw.newLine();
	}
	
	public void escreveObjetoArquivoTexto(Funcionario[] funcionarios) throws IOException {
		for(int i=0; i<funcionarios.length; i++) {
			escreveObjetoArquivoTexto(funcionarios[i]);
		}
	}
	
	public void fechaArquivo() throws IOException{
		bw.close();
	}
}
