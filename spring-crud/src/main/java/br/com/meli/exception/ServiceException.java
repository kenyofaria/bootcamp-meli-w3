package br.com.meli.exception;

public class ServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(String mensagem) {
		super(mensagem);
	}
	
	public ServiceException(RuntimeException e) {
		super(e);
	}
}
