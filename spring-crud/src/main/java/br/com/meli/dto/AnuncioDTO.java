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

	private VendedorDTO vendedor;

	public AnuncioDTO(String codigo, String titulo, BigDecimal preco, Integer quantidade, VendedorDTO vendedor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.vendedor = vendedor;
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

	public VendedorDTO getVendedor() {
		return vendedor;
	}

	public static Anuncio converte(AnuncioDTO dto) {
		return new Anuncio().comTitulo(dto.getTitulo()).comPreco(dto.getPreco())
				.comQuantidadeVendidaDe(dto.getQuantidade())
				.doVendedor(VendedorDTO.converte(dto.getVendedor()));
	}

	public static List<AnuncioDTO> converte(List<Anuncio> anuncios) {
		List<AnuncioDTO> listaDeAnunciosDTO = new ArrayList<>();
		for (Anuncio anuncio : anuncios) {
			listaDeAnunciosDTO.add(new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(),
					anuncio.getQuantidade(), VendedorDTO.converte(anuncio.getVendedor())));
		}
		return listaDeAnunciosDTO;
	}

	public static AnuncioDTO converte(Anuncio anuncio) {
		VendedorDTO vendedor = VendedorDTO.converte(anuncio.getVendedor());
		return new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade(), vendedor);
	}
}
