package com.dh.meli.w3.oo.lesson4.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.dh.meli.w3.oo.lesson4.model.Funcionario;

public class ArquivoUtil {

	private BufferedWriter bw;

	public ArquivoUtil(){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("funcionarios.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
		} catch (FileNotFoundException e) {
			System.out.println("deu pau");
		}
	}
	
	public void escreveObjetoArquivoTexto(Funcionario funcionario) throws IOException{
		bw.append(funcionario.toString());
		bw.newLine();
		
//		try {
//			bw.append(funcionario.toString());
//			bw.newLine();
//		}catch(IOException e) {
//			System.out.println("deu pau");
//		}
	}
	
	public void escreveObjetoArquivoTexto(Funcionario[] funcionarios) throws IOException{
		for(int i=0; i<funcionarios.length; i++) {
			escreveObjetoArquivoTexto(funcionarios[i]);
		}
	}
	
	public void fechaArquivo(){
		try {
			bw.close();
		}catch(IOException e) {
			System.out.println("deu pau");
		}
		
	}

}
