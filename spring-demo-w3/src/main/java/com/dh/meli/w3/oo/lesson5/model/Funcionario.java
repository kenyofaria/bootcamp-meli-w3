package com.dh.meli.w3.oo.lesson5.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Funcionario{

	private String nome;
	private String sexo;
	private double salario;
	
	private static DecimalFormat df = new DecimalFormat("#.##");
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sexo, double salario) {
		this.nome = nome;
		this.sexo = sexo;
		
		df.setRoundingMode(RoundingMode.UP);
		String format = df.format(salario);
		this.salario = Double.valueOf(format);
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	
	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return nome + "         " + sexo + "        " + salario;
	}
}
