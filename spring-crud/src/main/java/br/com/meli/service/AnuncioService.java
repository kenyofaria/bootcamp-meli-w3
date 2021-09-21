package br.com.meli.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import br.com.meli.entity.Anuncio;
import br.com.meli.persistence.AnuncioPersistence;

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
			anuncio.setCodigo(String.valueOf("MLB" + ThreadLocalRandom.current().nextInt(100, 999)));
			persistence.cadastro(anuncio);
		}else {
			throw new RuntimeException("Código já utilizado");
		}
	}

	public Anuncio obter(Long id) {
		return persistence.obtem(id);	
	}
	
	public List<Anuncio> listagem() {
		return persistence.listagem();
	}
}
