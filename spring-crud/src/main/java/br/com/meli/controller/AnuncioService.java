package br.com.meli.controller;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.meli.entity.Anuncio;

@Service
public class AnuncioService {

	private AnuncioPersistence persistence = new AnuncioPersistence();
	
	private boolean codigoNaoUtilizado(String codigo) {
		for(Anuncio anuncio: persistence.listagem()) {
			if(anuncio.getCodigo().equals(codigo)) {
				return false;
			}
		}
		return true;
	}
	
	public void cadastrar(Anuncio anuncio) {
		if(codigoNaoUtilizado(anuncio.getCodigo())) {
			anuncio.setId(persistence.listagem().size()+1L);
			persistence.cadastro(anuncio);
		}else {
			throw new RuntimeException("Código já utilizado");
		}
	}

	public List<Anuncio> listagem() {
		return persistence.listagem();
	}
}
