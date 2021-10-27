package br.com.meli.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.entity.Anuncio;

@RestController
@RequestMapping("/anuncios")
public class AnuncioController {

	@GetMapping
	public ResponseEntity<List<Anuncio>> listaDeAnuncios(){
	
		List<Anuncio> anuncios = Arrays.asList(
			new Anuncio("MLB123", "Anuncio 1", new BigDecimal(300)),
			new Anuncio("MLB234", "Anuncio 2", new BigDecimal(300)),
			new Anuncio("MLB345", "Anuncio 3", new BigDecimal(300)),
			new Anuncio("MLB456", "Anuncio 4", new BigDecimal(300)),
			new Anuncio("MLB567", "Anuncio 5", new BigDecimal(300)),
			new Anuncio("MLB678", "Anuncio 6", new BigDecimal(300)),
			new Anuncio("MLB789", "Anuncio 7", new BigDecimal(300)),
			new Anuncio("MLB098", "Anuncio 8", new BigDecimal(300)),
			new Anuncio("MLB987", "Anuncio 9", new BigDecimal(300)),
			new Anuncio("MLB876", "Anuncio 10", new BigDecimal(300))
		);
		return ResponseEntity.ok(anuncios);
	}
}
