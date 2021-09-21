package br.com.meli.entity;

public class Professor {

	private String primeiroNome;
	private String ultimoNome;
	private String senha;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String primeiroNome, String ultimoNome, String senha) {
		this.primeiroNome = primeiroNome;
		// TODO Auto-generated constructor stub
		this.ultimoNome = ultimoNome;
		this.senha = senha;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
