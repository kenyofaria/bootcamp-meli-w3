package br.com.meli.exception;

public class PersistenceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PersistenceException(String mensagem) {
		super(mensagem);
	}
	
	public PersistenceException(RuntimeException e) {
		super(e);
	}

	
}
