package com.dh.meli.w3;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.map.JsonMappingException;

//import com.fasterxml.jackson.core.JsonGenerator;
//import org.codehaus.jackson.map.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class AnuncioVendedorTest {


	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("MLB0987", "Kenyo Faria");
		
		vendedor.adicionaAnuncio(new Anuncio("MLB234", "Calça Jeans 38", new BigDecimal(60)));
		vendedor.adicionaAnuncio(new Anuncio("MLB345", "Calça Ginastica 38", new BigDecimal(65)));
		vendedor.adicionaAnuncio(new Anuncio("MLB456", "Calça Social 38", new BigDecimal(70)));
		vendedor.adicionaAnuncio(new Anuncio("MLB567", "Bermuda 38", new BigDecimal(100)));
		vendedor.adicionaAnuncio(new Anuncio("MLB678", "Jaqueta", new BigDecimal(120)));
		vendedor.adicionaAnuncio(new Anuncio("MLB789", "Blusa", new BigDecimal(80)));
		vendedor.adicionaAnuncio(new Anuncio("MLB098", "Chapeu do Panama", new BigDecimal(300)));
		vendedor.adicionaAnuncio(new Anuncio("MLB087", "Meia", new BigDecimal(10)));
		vendedor.adicionaAnuncio(new Anuncio("MLB076", "Camisa do Inter", new BigDecimal(10)));
		
		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		
		
		try {
			String s = mapper.writeValueAsString(vendedor);
			System.out.println(s);
			
			
			System.out.println("-------------- investigando os valores injetados no(s) objeto(s) a partir da string json ----------");
			
			Vendedor vendedorObtidoAPartirDoJson = mapper.readValue(s, Vendedor.class);
			System.out.println(vendedorObtidoAPartirDoJson.getCodigo() + " " + vendedorObtidoAPartirDoJson.getNome() + " -> " + vendedorObtidoAPartirDoJson.getAnuncios().size());
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch(JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
