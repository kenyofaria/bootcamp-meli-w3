package br.com.meli.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.meli.dto.AnuncioDTO;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

	
	@PostMapping(value = "/cadastra")
	public ResponseEntity<AnuncioDTO> cadastro(@RequestBody @Valid AnuncioDTO objetoDesserializado, UriComponentsBuilder uriBuilder) {
		System.out.println("payload recebido");
		return ResponseEntity.ok(objetoDesserializado);
	}
	
}
