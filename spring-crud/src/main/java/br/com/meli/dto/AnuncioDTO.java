package br.com.meli.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.meli.entity.Anuncio;

public class AnuncioDTO {

	private String codigo;
	@NotNull(message = "campo título é obrigatorio")
	@NotEmpty(message = "campo título é obrigatorio")
	@NotBlank(message = "campo título é obrigatorio")
	@Length(min=3)
	private String titulo;
	@NotNull(message = "campo preco é obrigatorio")
	@Min(value = 1, message = "preco deve ser maior ou igual a R$ 1")
	private BigDecimal preco;
	private Integer quantidade;

	@JsonIgnore
	private VendedorDTO vendedor;

	public AnuncioDTO(String codigo, String titulo, BigDecimal preco, Integer quantidade, VendedorDTO vendedor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.vendedor = vendedor;
	}

	public AnuncioDTO(String codigo, String titulo, BigDecimal preco, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public AnuncioDTO() {
		// TODO Auto-generated constructor stub
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
		if (dto.getVendedor() != null) {
			return new Anuncio().comTitulo(dto.getTitulo()).comPreco(dto.getPreco())
					.comEstoqueDe(dto.getQuantidade())
					.comQuantidadeVendidaDe(dto.getQuantidade()).doVendedor(VendedorDTO.converte(dto.getVendedor()));
		}else {
			return new Anuncio().comTitulo(dto.getTitulo()).comPreco(dto.getPreco())
					.comEstoqueDe(dto.getQuantidade())
					.comQuantidadeVendidaDe(dto.getQuantidade());
		}

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
		if(anuncio.getVendedor()!=null) {
			VendedorDTO vendedor = VendedorDTO.converte(anuncio.getVendedor());
			return new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade(),
					vendedor);			
		}else {
			return new AnuncioDTO(anuncio.getCodigo(), anuncio.getTitulo(), anuncio.getPreco(), anuncio.getQuantidade());
		}
	}
}
