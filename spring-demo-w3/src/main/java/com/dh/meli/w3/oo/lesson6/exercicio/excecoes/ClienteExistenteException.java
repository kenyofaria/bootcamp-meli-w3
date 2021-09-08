package com.dh.meli.w3.oo.lesson6.exercicio.excecoes;

public class ClienteExistenteException extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1187460338521076577L;

	public ClienteExistenteException(String mensagem) {
		super(mensagem);
	}
}
