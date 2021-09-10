package com.dh.meli.w3.oo.lesson8;

public class DAOTeste {

	public static void main(String[] args) {
		Paciente paciente = new Paciente(1l, "thor");
		Medico medico = new Medico(10l, "837348-GO", "Chapatim");
		
		PacienteDAO pacienteDAO = new PacienteDAO();
		pacienteDAO.salva(paciente);
	
		
	}

}
