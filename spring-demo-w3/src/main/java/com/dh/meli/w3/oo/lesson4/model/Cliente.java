package com.dh.meli.w3.oo.lesson4.model;

public class Cliente implements UsuarioAutenticavel{

	
	private DadosAutenticacao dadosAutenticacao;
	
	
	public Cliente(String login, String senha) {
		dadosAutenticacao = new DadosAutenticacao(login, senha);
	}
	
	@Override
	public boolean autentica(String login, String senha) {
		if(login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha()))
			return true;
		else return false;
	}
	

}
