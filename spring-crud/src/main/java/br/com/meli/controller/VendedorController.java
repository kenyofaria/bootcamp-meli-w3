package br.com.meli.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.meli.dto.VendedorDTO;
import br.com.meli.entity.Vendedor;
import br.com.meli.service.VendedorService;

@RestController
@RequestMapping(value="/vendedores")
public class VendedorController {

	@Autowired
	private VendedorService vendedorService;
	
	@PostMapping(value = "/cadastra")
	public ResponseEntity<VendedorDTO> cadastro(@RequestBody VendedorDTO payLoad,  UriComponentsBuilder uriBuilder){
		Vendedor vendedor = VendedorDTO.converte(payLoad);
		vendedorService.cadastrar(vendedor);
		URI uri = uriBuilder.path("/vendedores/{codigo}").buildAndExpand(vendedor.getCodigo()).toUri();
		VendedorDTO dto = VendedorDTO.converte(vendedor);
		return ResponseEntity.created(uri).body(dto);
	}
	
	@GetMapping(value="/handler")
	public void handler() {
		throw new ArithmeticException("olha... algo serio aconteceu. fuja para as montanhas");
	}
	
	@DeleteMapping(value="/deleta/{codigo}")
	public void cadastro(@PathVariable("codigo") String codigo){
		vendedorService.remover(codigo);
	}
	
}
