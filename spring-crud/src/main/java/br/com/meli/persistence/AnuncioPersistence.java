package br.com.meli.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.meli.entity.Anuncio;

//classe especializada em realizar persistencia de anuncios

@Repository
public class AnuncioPersistence {

	private static List<Anuncio> anuncios = new ArrayList<>();

	public void cadastro(Anuncio anuncio) {
		anuncio.setId(anuncios.size() + 1L);
		anuncios.add(anuncio);
	}

	public List<Anuncio> listagem() {
		return anuncios;
	}

	public Anuncio obtem(Long id) {
		Optional<Anuncio> optionalAnuncio = anuncios.stream().filter(a -> a.getId().equals(id)).findFirst();
		return optionalAnuncio.orElseThrow(()-> new RuntimeException("anuncio inexistente"));
	}

}
