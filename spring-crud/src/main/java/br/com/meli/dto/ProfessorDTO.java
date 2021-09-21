package br.com.meli.dto;

public class ProfessorDTO {

	private String primeiroNome;
	private String ultimoNome;
	
	public ProfessorDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProfessorDTO(String primeiroNome, String ultimoNome) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
}
