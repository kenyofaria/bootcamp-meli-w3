package br.com.meli.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


public class ArquivoUtil {

	private File file;
	private BufferedWriter bw;
	private BufferedReader br;

	public ArquivoUtil(File file){
		this.file = file;
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fos = new FileOutputStream(this.file, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			
			fis = new FileInputStream(this.file);
			InputStreamReader isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao conectar ao arquivo");
		}
	}
	
	public void escreve(String registro) throws IOException{
		bw.append(registro);
		bw.newLine();
	}
	
	public void escreve(List<String> registros) throws IOException{
		registros.forEach(registro -> {
			try {
				escreve(registro);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
	}
	
	public void fechaArquivo(){
		try {
			bw.close();
		}catch(IOException e) {
			System.out.println("deu pau");
		}
		
	}

	public List<String> retornaRegistros() throws IOException {
		List<String> registros = new ArrayList<String>();
		while(true) {
			String linha = br.readLine();
			if(linha==null) {
				break;
			}
			registros.add(linha);
		}
		return registros;
	}
}
