package br.com.meli.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.dto.AnuncioDTO;
import br.com.meli.entity.Anuncio;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

	@Autowired
	private AnuncioService service; //new AnuncioService()
	
	@PostMapping(value = "/cadastra")
	public ResponseEntity<AnuncioDTO> cadastro(@RequestBody AnuncioDTO objetoDesserializado) {
		Anuncio anuncio = converte(objetoDesserializado);
		service.cadastrar(anuncio);
		return ResponseEntity.ok(objetoDesserializado);
	}
	
	@GetMapping(value = "/list")
	public List<AnuncioDTO> lista(){
		List<Anuncio> listaDeAnuncios = service.listagem();
		List<AnuncioDTO> listaDeDTOs = converte(listaDeAnuncios);
		return listaDeDTOs;
	}
	
	private Anuncio converte(AnuncioDTO dto) {
		return new Anuncio(dto.getCodigo(), dto.getTitulo(), dto.getPreco(), dto.getQuantidade());
	}
	
	private List<AnuncioDTO> converte(List<Anuncio> anuncios){
		List<AnuncioDTO> listaDeAnunciosDTO = new ArrayList<>();
		for(Anuncio anuncio: anuncios) {
			listaDeAnunciosDTO .add(new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade()));
		}
		return listaDeAnunciosDTO;
		
	}
	
	
}
