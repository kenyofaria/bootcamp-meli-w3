package br.com.meli.service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import br.com.meli.entity.Anuncio;
import br.com.meli.exception.ServiceException;
import br.com.meli.persistence.AnuncioPersistence;

@Service
public class AnuncioService {

	private AnuncioPersistence persistence = new AnuncioPersistence();
	
	private boolean codigoNaoUtilizado(String codigo) {
		Optional<Anuncio> anuncio = persistence.listagem().stream().filter(a -> a.getCodigo().equalsIgnoreCase(codigo)).findAny();
		return anuncio.isPresent();
	}
	
	public void cadastrar(Anuncio anuncio) {
		if(codigoNaoUtilizado(anuncio.getCodigo())) {
			anuncio.setCodigo(String.valueOf("MLB" + ThreadLocalRandom.current().nextInt(100, 999)));
			persistence.cadastro(anuncio);
		}else {
			throw new ServiceException("Código já utilizado");
		}
	}

	public Anuncio obter(Long id) {
		return persistence.obtem(id);	
	}
	
	public List<Anuncio> listagem() {
		return persistence.listagem();
	}
}
