package com.dh.meli.w3.oo.lesson4;

public class Gerente extends Funcionario{

	
	public Gerente(String n, String s, double sal) {
		super(n,s,sal);
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
