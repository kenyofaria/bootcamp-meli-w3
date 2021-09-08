package com.dh.meli.w3.oo.lesson5.model;

import com.dh.meli.w3.oo.lesson5.exception.LoginException;

public class Cliente implements UsuarioAutenticavel{

	
	private DadosAutenticacao dadosAutenticacao;
	
	
	public Cliente(String login, String senha) {
		dadosAutenticacao = new DadosAutenticacao(login, senha);
	}
	
	@Override
	public void autentica(String login, String senha) {
		if(login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha())) {
			//escreve codigo que encaminha requisicao para uma pagina
			System.out.println("usuario logado");
		}else {
			throw new LoginException("Erro no login");
		}
	}
	

}
