package com.dh.meli.w3.oo.lesson4.model;

public class DadosAutenticacao {

	
	private String login;
	private String senha;
	
	
	public DadosAutenticacao(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
}
