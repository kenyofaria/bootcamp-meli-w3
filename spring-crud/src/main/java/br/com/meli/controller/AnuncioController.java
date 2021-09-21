package br.com.meli.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.meli.dto.AnuncioDTO;
import br.com.meli.entity.Anuncio;
import br.com.meli.service.AnuncioService;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

	@Autowired
	private AnuncioService service; //new AnuncioService()
	
	@PostMapping(value = "/cadastra")
	public ResponseEntity<AnuncioDTO> cadastro(@RequestBody AnuncioDTO objetoDesserializado, UriComponentsBuilder uriBuilder) {
		Anuncio anuncio = AnuncioDTO.converte(objetoDesserializado);
		service.cadastrar(anuncio);
		URI uri = uriBuilder.path("/anuncios/{id}").buildAndExpand(anuncio.getId()).toUri();
		return ResponseEntity.created(uri).body(objetoDesserializado);
	}
	
	@GetMapping(value = "/list")
	public List<AnuncioDTO> lista(){
		List<Anuncio> listaDeAnuncios = service.listagem();
		List<AnuncioDTO> listaDeDTOs = AnuncioDTO.converte(listaDeAnuncios);
		return listaDeDTOs;
	}
	
	@GetMapping(value = "/{id}")
	public AnuncioDTO obter(@PathVariable("id") Long id) {
		Anuncio anuncio = service.obter(id);
		AnuncioDTO dto = AnuncioDTO.converte(anuncio);
		return dto;
	}
	
}
