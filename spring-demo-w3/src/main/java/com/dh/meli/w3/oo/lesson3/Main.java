package com.dh.meli.w3.oo.lesson3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	//encapsulamento
	public static void main(String[] args) throws IOException {
		Funcionario kenyo = new Funcionario("kenyo", "m", 3000.198);
		
		Funcionario mauri = new Funcionario("mauri", "m", 5000.198);
		Funcionario joice = new Funcionario("joice", "f", 7000.198);
		Funcionario filipe = new Funcionario("filipe", "m", 10000.198);
		Gerente thiago = new Gerente("thiago", "m", 13000);
		Vendedor ana = new Vendedor("ana carolina", "f", 20000, 100000);
		
		
		FileOutputStream fos = new FileOutputStream("funcionarios.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.append(kenyo.toString());
		bw.newLine();
		bw.append(mauri.toString());
		bw.newLine();
		bw.append(joice.toString());
		bw.newLine();
		bw.append(filipe.toString());
		bw.newLine();
		bw.append(thiago.toString());
		bw.newLine();
		bw.append(ana.toString());
		
		
		bw.close();
	}
}
