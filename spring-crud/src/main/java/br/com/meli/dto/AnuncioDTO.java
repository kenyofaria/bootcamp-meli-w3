package br.com.meli.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.meli.entity.Anuncio;

public class AnuncioDTO {

	private String codigo;
	private String titulo;
	private BigDecimal preco;
	private Integer quantidade;
	
	public AnuncioDTO(String codigo, String titulo, BigDecimal preco, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public static Anuncio converte(AnuncioDTO dto) {
		return new Anuncio().comCodigo(dto.getCodigo())
		.comTitulo(dto.getTitulo())
		.comPreco(dto.getPreco())
		.comQuantidadeVendidaDe(dto.getQuantidade());
	}
	
	public static List<AnuncioDTO> converte(List<Anuncio> anuncios){
		List<AnuncioDTO> listaDeAnunciosDTO = new ArrayList<>();
		for(Anuncio anuncio: anuncios) {
			listaDeAnunciosDTO .add(new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade()));
		}
		return listaDeAnunciosDTO;
	}
	
	public static AnuncioDTO converte(Anuncio anuncio) {
		return new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade());
	}
}
