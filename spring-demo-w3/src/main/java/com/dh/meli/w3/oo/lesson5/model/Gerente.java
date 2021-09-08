package com.dh.meli.w3.oo.lesson5.model;

public class Gerente extends Funcionario{

	
	public Gerente(String nome, String sexo, double salario) {
		super(nome,sexo,salario);
	}
	
	public double getGratificacao() {
		return super.getSalario() * 0.05;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + getGratificacao();
	}
	
	@Override
	public String toString() {
		return super.toString() + "      " + getGratificacao();
	}
	
}
