package com.dh.meli.w3.oo.lesson4.model;

public class Vendedor extends Funcionario{

	private double faturamento;
	
	public Vendedor(String nome, String sexo, double salario, double faturamento) {
		super(nome,sexo,salario);
		this.faturamento = faturamento;
	}

	public double getComissao() {
		return faturamento * 0.05;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + getComissao();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "      " + getComissao() + "     " + getSalario();
	}
}
