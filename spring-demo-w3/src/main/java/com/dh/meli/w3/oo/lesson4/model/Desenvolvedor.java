package com.dh.meli.w3.oo.lesson4.model;

public class Desenvolvedor extends Funcionario implements UsuarioAutenticavel{

	private DadosAutenticacao dadosAutenticacao;
	
	public Desenvolvedor(String nome, String sexo, double salario, String login, String senha) {
		super(nome,sexo,salario);
		dadosAutenticacao = new DadosAutenticacao(login, senha);
	}
	

	@Override
	public boolean autentica(String login, String senha) {
		return login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha());
	}
}
