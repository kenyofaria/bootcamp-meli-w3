package com.dh.meli.w3.oo.lesson8;

public interface DAO<T> {

	
	T retornaRegistroPorIdendificador(long id);
	void salva(T o);
}
